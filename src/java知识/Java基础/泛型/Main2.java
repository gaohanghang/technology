package java知识.Java基础.泛型;

public class Main2 {

    public static void main(String[] args) {

        Cache cache = new Cache();

        cache.setValue(135);
        int value = (int) cache.getValue();

        cache.setValue("hello");
        String value1 = (String) cache.getValue();

    }

}

