package 面试题.java创建对象的五种方式;

public class ClassNewInstance {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person person = Person.class.newInstance();
        person.setAge(18);
        person.setName("酸辣汤");
        System.out.println(person);
    }

}
