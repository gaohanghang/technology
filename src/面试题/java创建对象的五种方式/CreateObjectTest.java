package 面试题.java创建对象的五种方式;


public class CreateObjectTest implements Cloneable{

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

    public CreateObjectTest(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            CreateObjectTest createObjectTest = new CreateObjectTest("酸辣汤",18);//todo
            CreateObjectTest copyClone = (CreateObjectTest) createObjectTest.clone();
            System.out.println("newclone:"+ createObjectTest.getName());
            System.out.println("copyClone:"+copyClone.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
