package java知识.知识星球.直面java.a146Java中创建对象的方法有几种;

/**
 * @author: Gao HangHang
 * @date 2018/10/01
 */
public class CloneTest implements Cloneable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CloneTest(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            CloneTest cloneTest = new CloneTest("wangql", 18);
            CloneTest copyClone = (CloneTest) cloneTest.clone();
            System.out.println("newclone:" + cloneTest.getName());
            System.out.println("copyClone:" + copyClone.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
