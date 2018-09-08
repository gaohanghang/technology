package java知识.Java基础.泛型.泛型的定义和使用;

public class Main2 {

    public static void main(String[] args) {

        Test1<String> t = new Test1<>();

        t.testMethod("generic");

        Integer i = t.testMethod1(new Integer(1));

        /*
            泛型类的实际类型参数是 String，而传递给泛型方法的类型参数是 Integer，两者不想干。
         */

    }

}
