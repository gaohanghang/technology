package java知识.公众号.高德技术.a9_12;

import java.util.Objects;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-17 21:12
 **/
//public class Test {
//    // 抢取订单函数
//    public synchronized void grabOrder(Long orderId, Long userId) {
//        // 获取订单信息
//        OrderDO order = orderDAO.get(orderId);
//        if (Objects.isNull(order)) {
//            throw new BizRuntimeException(String.format("订单(%s)不存在", orderId));
//        }
//
//        // 检查订单状态
//        if (!Objects.equals(order.getStatus, OrderStatus.WAITING_TO_GRAB.getValue())) {
//            throw new BizRuntimeException(String.format("订单(%s)已被抢", orderId));
//        }
//
//        // 设置订单被抢
//        orderDAO.setGrabed(orderId, userId);
//    }
//}
