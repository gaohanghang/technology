package java知识.java核心技术.a5.a5_1_9;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 17:24
 */
public class Student extends Person{
    private String major; // 主修

    /**
     * @param name the student's name
     * @param major the student's major
     */
    public Student(String name, String major) {
        // pass n to superclass constructor
        super(name);
        this.major = major;
    }

    public String getlDescription() {
        return "a student majoring in " + major;
    }
}
