package java知识.公众号.Java技术栈.a2018.a5_14;

public class TestClass {
    public static void main(String[] args) {
        TestInnterClass[] testInnterClasses = new TestInnterClass[]{
                new TestInnterClass(),
                new TestInnterClass(),
                new TestInnterClass()
        };
        System.out.println("getName            " + testInnterClasses.getClass().getName());
        System.out.println("getCanonicalName   " + testInnterClasses.getClass().getCanonicalName());
        System.out.println("getSimpleName   " + testInnterClasses.getClass().getSimpleName());
    }

    static class TestInnterClass {

    }
}
