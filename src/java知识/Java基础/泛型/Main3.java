package java知识.Java基础.泛型;

public class Main3 {

    public static void main(String[] args) {

        Cache2<String> cache1 = new Cache2();
        cache1.setValue("123");
        String value = cache1.getValue();

        Cache2<Integer> cache2 = new Cache2<>();
        cache2.setValue(456);
        int value3 = cache2.getValue();

    }

}
