package java知识.java核心技术.a6.a6_1_6;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/24 15:05
 */
public class Student implements Person, Named {

    public String getName() {
        return Person.super.getName();
    }
}
