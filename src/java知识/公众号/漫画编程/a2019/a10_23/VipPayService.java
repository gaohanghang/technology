package java知识.公众号.漫画编程.a2019.a10_23;

import java知识.公众号.漫画编程.a2019.a10_23.工厂模式.UserPayServiceStrategyFactory;
import org.springframework.beans.factory.InitializingBean;

import java.math.BigDecimal;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-10-23 23:05
 **/
public class VipPayService implements UserPayService, InitializingBean {

    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("Vip",this);
    }

}
