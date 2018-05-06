package java知识.公众号.Java技术栈.a2017.a9_07;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Main.class.getClassLoader().loadClass("com.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
