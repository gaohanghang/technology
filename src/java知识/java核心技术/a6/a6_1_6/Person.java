package java知识.java核心技术.a6.a6_1_6;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/24 15:05
 */
interface Person {
    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }

    ;
}
