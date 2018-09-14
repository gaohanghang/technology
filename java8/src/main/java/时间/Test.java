package 时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/13 下午5:47
 */
public class Test {

    public static void main(String[] args) throws ParseException {


        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");

        Date beginDate = new Date();

        Calendar date = Calendar.getInstance();

        date.setTime(beginDate);

        date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);


    }

}
