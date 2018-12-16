package java知识.java核心技术.a5.a5_1_9;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 17:16
 */
public abstract class Person {
    public abstract String getlDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
