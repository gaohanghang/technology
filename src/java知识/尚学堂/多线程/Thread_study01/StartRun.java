package java知识.尚学堂.多线程.Thread_study01;

/**
 * 创建线程方式二：
 * 1、创建：实现Runable+重写run
 * 2、启动：创建实现类对象 + Thread对象 + start
 *
 * 推荐：避免单继承的局限性，优先使用接口
 * 方便共享资源
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/19 15:21
 */
public class StartRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
       /* // 创建实现类对象
        StartRun st = new StartRun();
        // 创建代理类对象
        Thread t = new Thread(st);
        // 启动
        t.start(); // 不保证立即运行 cpu调用*/

       new Thread(new StartRun()).start();

    }
}
