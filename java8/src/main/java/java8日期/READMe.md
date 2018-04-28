
## 处理日期的 LocalDate
不同于 Calendar 既能处理日期又能处理时间，java.time 的新式 API 分离开日期和时间，用单独的类进行处理。LocalDate 专注于处理日期相关信息。
LocalDate 依然是一个不可变类，它关注时间中年月日部分，我们可以通过以下的方法构建和初始化一个 LocalDate 实例：

- public static LocalDate now()：截断当前系统时间的年月日信息并初始化一个实例对象
- public static LocalDate of(int year, int month, int dayOfMonth)：显式指定年月日信息
- public static LocalDate ofYearDay(int year, int dayOfYear)：根据 dayOfYear 可以推出 month 和 dayOfMonth
- public static LocalDate ofEpochDay(long epochDay)：相对于格林零时区时间的日偏移量

