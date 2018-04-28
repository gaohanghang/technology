# Java 8 的时间日期 API

> [Java 8 的时间日期 API](https://juejin.im/post/5addc7a66fb9a07aa43bd2a0)

上一篇文章『Java 的时间日期 API』中，我们学习了由 Date、Calendar，DateFormat 等组成的「传统时间日期 API」，但是传统的处理接口设计并不是很友好，不易使用。终于，Java 8 借鉴第三方优秀开源库 Joda-time，重新设计了一套 API。

那么本篇文章就来简单学习一下新式的时间日期处理接口。



### 表示时刻的 Instant

Instant 和 Date 一样，表示一个时间戳，用于描述一个时刻，只不过它较 Date 而言，可以描述更加精确的时刻。并且 Instant 是时区无关的。

Date 最多可以表示毫秒级别的时刻，而 Instant 可以表示纳秒级别的时刻。例如：

- public static Instant now()：根据系统当前时间创建一个 Instant 实例，表示当前时刻
- public static Instant ofEpochSecond(long epochSecond)：通过传入一个标准时间的偏移值来构建一个 Instant 实例
- public static Instant ofEpochMilli(long epochMilli)：通过毫秒数值直接构建一个 Instant 实例

看看代码：

```
public static void main(String[] args){
    //创建 Instant 实例
    Instant instant = Instant.now();
    System.out.println(instant);

    Instant instant1 = Instant.ofEpochSecond(20);
    System.out.println(instant1);

    Instant instant2 = Instant.ofEpochSecond(30,100);
    System.out.println(instant2);

    Instant instant3 = Instant.ofEpochMilli(1000);
    System.out.println(instant3);
}

```

输出结果：

```
2018-04-23T02:43:10.973Z
1970-01-01T00:00:20Z
1970-01-01T00:00:30.000000100Z
1970-01-01T00:00:01Z

```

可以看到，Instant 和 Date 不同的是，它是时区无关的，始终是格林零时区相关的，也即是输出的结果始终格林零时区时间。

### 处理日期的 LocalDate

不同于 Calendar 既能处理日期又能处理时间，java.time 的新式 API 分离开日期和时间，用单独的类进行处理。LocalDate 专注于处理日期相关信息。

LocalDate 依然是一个不可变类，它关注时间中年月日部分，我们可以通过以下的方法构建和初始化一个 LocalDate 实例：

- public static LocalDate now()：截断当前系统时间的年月日信息并初始化一个实例对象
- public static LocalDate of(int year, int month, int dayOfMonth)：显式指定年月日信息
- public static LocalDate ofYearDay(int year, int dayOfYear)：根据 dayOfYear 可以推出 month 和 dayOfMonth
- public static LocalDate ofEpochDay(long epochDay)：相对于格林零时区时间的日偏移量

看看代码：

```
public static void main(String[] args){
    //构建 LocalDate 实例
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

    LocalDate localDate1 = LocalDate.of(2017,7,22);
    System.out.println(localDate1);

    LocalDate localDate2 = LocalDate.ofYearDay(2018,100);
    System.out.println(localDate2);

    LocalDate localDate3 = LocalDate.ofEpochDay(10);
    System.out.println(localDate3);
}

```

输出结果：

```
2018-04-23
2017-07-22
2018-04-10
1970-01-11

```

**需要注意一点，LocalDate 会根据系统中当前时刻和默认时区计算出年月日的信息。**

除此之外，LocalDate 中还有大量关于日期的常用方法：

- public int getYear()：获取年份信息
- public int getMonthValue()：获取月份信息
- public int getDayOfMonth()：获取当前日是这个月的第几天
- public int getDayOfYear()：获取当前日是这一年的第几天
- public boolean isLeapYear()：是否是闰年
- public int lengthOfYear()：获取这一年有多少天
- public DayOfWeek getDayOfWeek()：返回星期信息
- 等等

这些方法都见名知意，此处不再赘述。

![image](https://user-gold-cdn.xitu.io/2018/4/17/162d35705b198db6?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)