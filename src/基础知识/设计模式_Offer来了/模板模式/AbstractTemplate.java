package 基础知识.设计模式_Offer来了.模板模式;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description 内容来自 https://weread.qq.com/web/reader/d0c3212071a74c21d0c04fdk68d3221025468d30a95982e
 * @date 2024-12-20 08:23
 **/
public abstract class AbstractTemplate {
    private final static Log logger = LogFactory.getLog(AbstractTemplate.class);
    public void templateMethod() { // 模板方法，用于核心流程和算法定义
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }
    public void checkNumber() { // 1: 抽号
        logger.info("checkNumber......");
    }
    public void queueUp() { // 2：排队
        logger.info("queue up......");
    }
    public abstract void handleBusiness(); // 3：业务办理
    public void serviceEvaluation() { // 4：服务评价
        logger.info("business finished, service evaluation......");
    }
}
