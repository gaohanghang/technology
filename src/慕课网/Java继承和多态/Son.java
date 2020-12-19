package 慕课网.Java继承和多态;

/**
 * @Description 子类：当前类型
 * @Author Gao Hang Hang
 * @Date 2020-10-02 20:17
 **/
public class Son extends Father{

    public void playGame() {
        System.out.println(this.name + "在游戏中...");
    }

    public static void main(String[] args) {
        Son son = new Son();
        // 操作属性
        son.name = "李白"; // 继承
        // 操作方法
        son.working(); // 继承
        son.playGame(); // 自有
    }

}
