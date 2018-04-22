# MySQL分库分表

```
分表分库
什么时候分库
电商项目将一个项目进行拆分，拆分成多个小项目，每个小的项目有自己单独数据库。
互不影响---垂直分割 会员数据库、订单数据库、支付数据库
-----------
什么时候分表
水平分割 分表，根据业务需求 存放日志（每年存放） 根据年分表、腾讯QQ号
位数（缺点）、不均匀 10位 9位 8位、手机号 前3位 136 138 155

水平分割（取模算法）
user    分成3表    6条数据存放在3张表中，怎么非常均匀  
id   name      address                 
1   zhangsan   上海市浦东新区      user0           user1           user2         
2   zhangsan   上海市浦东新区     3 zhangsan    1  zhangsan    2 zhangsan
3   zhangsan   上海市浦东新区      6   zhangsan 4   zhangsan 5   zhangsan 
4   zhangsan   上海市浦东新区
5   zhangsan   上海市浦东新区
6   zhangsan   上海市浦东新区

实现取模分表算法 专门有一张表存放userid
均匀分配  6%3=0  mycat
rpc id


分表之后有什么缺点：1.分页查询 2.查询非常受限制

先主表存放所有数据  根据具体业务需求进行分表
mycar 分表功能。
取模算法 如果表发生改变了

rds







```