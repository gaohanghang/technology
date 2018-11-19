package java8日期;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/11/18 3:15 PM
 */
public class Test {

    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * 通过给定截止日期，返回与当前时间相差的时段对象Period,Period是以年月日来衡量一个时间段
     *
     * @param endDate 截止日期
     * @return （截止日期 - 当前日期）Period
     */
    public static Period diffDaysFromNow(Date endDate) {
        synchronized (endDate) {
            LocalDate queryTime = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Period period = Period.between(queryTime, LocalDate.now());
            return period;
        }
    }

    /**
     * 通过返回Duration
     */

}
