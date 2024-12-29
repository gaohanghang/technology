package 基础知识.设计模式_Offer来了.模板模式;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-12-20 08:34
 **/
public class TakeMoney extends AbstractTemplate {
    private final static Log logger = LogFactory.getLog(AbstractTemplate.class);

    @Override
    public void handleBusiness() {
        logger.info("take money from bank.");
    }
}
