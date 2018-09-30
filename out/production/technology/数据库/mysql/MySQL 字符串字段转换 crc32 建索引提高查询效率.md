# MySQL 字符串字段转换 crc32 建索引提高查询效率

给字符串类型的字段建立索引效率不高，但是必须要经常查这个字段怎么建索引？比如这个字段名称是 sys_trans_id 字符串类型，那么可以建一个字段 sys_trans_id_src32 来存储 crc32 的值，并给这个字段建立索引。

crc32 是整形，在MySQL中，给整形字段建立索引效率比较高，crc32虽然不能确保唯一性，但是无碍，相同的机率也是极小，关键是可以大大减少查询的范围，给sys_trans_id_src32 这个字段建立索引，查询的时候带上 crc32 字段就可以利用到索引。

SQL 如下，比如要查询 sys_trans_id，同时带上 sys_trans_id_src32 走索引：

```sql
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
EXPLAIN SELECT
	*
FROM
	`js_checking_third_detail`
WHERE
	(`biz_date` = '20160104')
AND (`diff_type` IN('2', '3'))
AND (
	`sys_trans_id_src32` = '509417929'
)
AND (
	`sys_trans_id` = '11451875264169885'
)
AND (`trans_type` = '1')
AND (`pay_type` = '1')
AND (`account_id` = '1')
ORDER BY
	diff_type DESC,
	biz_date DESC,
	id DESC
LIMIT 0,
 50
```

这样就通过 crc32 字段利用到了索引，看看索引的使用情况：

![crc32索引](https://oddyzfr8z.qnssl.com/wp-content/uploads/2016/02/crc92406.png)



假设不带上这个crc32的查询：

![crc32092506](https://oddyzfr8z.qnssl.com/wp-content/uploads/2016/02/crc32092506.png)

效率上的差别还是挺大的，数据越多越明显。

使用 PHP 的 crc32 函数可能会出现负值的情况，修正方法如下：

```php
/**
 * @desc CRC32的修正方法，修正php x86模式下出现的负值情况
 * @param $str
 * @return string
 */
function crc32($str){
    return sprintf("%u",crc32($str));
}
```

存储数据的时候顺便也计算一下 crc32 的值存进去即可，查询的时候同样先算出要查询字段的 crc32.

### crc32 的冲突概率

引用一下结论：

> 1）CRC32 在完全随机的输入情况下，冲突概率还是比较高的，特别是到了 1 亿的数据量后，冲突概率会更高
>
> 2）CRC32 在输入某个连续段的数据情况下，冲突概率反而很低，这是因为两个冲突的原值理论上应该是相隔很远，只输入某段数据的情况下，这个段里面冲突的原值会很少

（转载请注明出处，原文网址：<https://blog.tanteng.me/2016/02/crc32-mysql-index/>）



