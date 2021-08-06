package 基础知识.Java多线程.自定义线程池;

/**
 * 需求：
 * 自定义线程池练习，这是任务类，需要实现Runnable接口;
 * 包含任务编号，每一个任务执行时间设计为 0.2 秒
 **/
public class MyTask implements Runnable {
    private int id;
    // 由于run 方法是重写接口中方法，因此id这个属性初始化可以利用构造方法完成

    public MyTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("线程：" + name + "即将执行任务：" + id);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程：" + name + "完成了任务：" + id);
    }
}
