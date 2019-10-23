package java知识.公众号.漫画编程.a2019.a10_23;

import java.math.BigDecimal;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-10-23 23:03
 **/
public interface UserPayService {

    /**
     * 计算应付价格
     */
    public BigDecimal quote(BigDecimal orderPrice);
}
