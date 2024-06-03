package 基础知识.Java基础.回调;

public class Person implements CallBack {
    private Genius genius;
    public Person(Genius genius) {
        this.genius = genius;
    }
    @Override
    public void callback(String string) {
        System.out.println("收到答案：" + string);
    }
    public void ask() {
        genius.answer(this);
    }
}
