package java知识.java核心技术卷1.a5.a5_1_9;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 10:07
 */
public class Student extends Person {
    private String major;

    /**
     * @param name  the student's name
     * @param major the student's major
     */
    public Student(String name, String major) {
        // pass n to superclass constructor
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
