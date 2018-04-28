package java8日期;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 时区相关的日期时间处理 ZonedDateTime
 * 无论是我们的 LocalDate，或是 LocalTime，甚至是 LocalDateTime，它们基本是时区无关的，内部并没有存储时区属性，而基本用的系统默认时区。往往有些场景之下，缺乏一定的灵活性。
 * ZonedDateTime 可以被理解为 LocalDateTime 的外层封装，它的内部存储了一个 LocalDateTime 的实例，专门用于普通的日期时间处理。此外，它还定义了 ZoneId 和 ZoneOffset 来描述时区的概念。
 * ZonedDateTime 和 LocalDateTime 的一个很大的不同点在于，后者内部并没有存储时区，所以对于系统的依赖性很强，往往换一个时区可能就会导致程序中的日期时间不一致。
 * 而后者则可以通过传入时区的名称，使用 ZoneId 进行匹配存储，也可以通过传入与零时区的偏移量，使用 ZoneOffset 存储时区信息。
 * 所以，构建一个 ZonedDateTime 实例有以下几种方式：
 *
 * public static ZonedDateTime now()：系统将以默认时区计算并存储日期时间信息
 * public static ZonedDateTime now(ZoneId zone)：指定时区
 * public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone)：指定日期时间和时区
 * public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone)
 * public static ZonedDateTime ofInstant(Instant instant, ZoneId zone)：通过时刻和时区构建实例对象
 * 等等
 *
 * 简单解释一下，首先第一个输出应该没什么问题，系统保存当前系统日期和时间以及默认的时区。
 * 第二个小例子，LocalDateTime 实例保存了时区无关的当前日期时间信息，也就是这里的年月日时分秒，接着构建一个 ZonedDateTime 实例并传入一个美国时区（西七区）。你会发现输出的日期时间为西七区的 16 点 29 分。
 * 像这种关联了时区的日期时间就很能够解决那种，换时区导致程序中时间错乱的问题。因为我关联了时区，无论你程序换到什么地方运行了，日期+时区 本就已经唯一确定了某个时刻，就相当于我在存储某个时刻的时候，我说明了这是某某时区的某某时间，即便你换了一个地区，你也不至于把这个时间按自己当前的时区进行解析并直接使用了吧。
 * 第三个小例子就更加的直接明了了，构建 ZonedDateTime 实例的时候，给定一个时刻和一个时区，而这个时刻值就是相对于给定时区的标准时间所经过的毫秒数。
 * 有关 ZonedDateTime 的其他日期时间的处理方法和 LocalDateTime 是一样的，因为 ZonedDateTime 是直接封装了一个 LocalDateTime 实例对象，所以所有相关日期时间的操作都会间接的调用 LocalDateTime 实例的方法，我们不再赘述。
 */
public class ZonedDateTimeTest {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime1);

        Instant instant = Instant.now();
        ZoneId zoneId1 = ZoneId.of("GMT");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant,zoneId1);
        System.out.println(zonedDateTime2);
    }
}
