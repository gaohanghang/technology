package java知识.尚学堂.多线程.Thread_study01;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/19 15:26
 */
public class IDownloader implements Runnable{
    private String url; // 远程路径
    private String name; // 存储名字

    public IDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader wd = new WebDownloader();
        wd.download(url, name);
    }

    public static void main(String[] args) {
        IDownloader td1 = new IDownloader("https://img1.doubanio.com/view/note/l/public/p56831139.webp", "1.webp");
        IDownloader td2 = new IDownloader("https://img3.doubanio.com/view/note/l/public/p56831141.webp", "2.webp");
        IDownloader td3 = new IDownloader("https://img1.doubanio.com/view/thing_review/l/public/p1967527.webp", "3.webp");

        // 启动三个线程
        new Thread(td1).start();
        new Thread(td2).start();
        new Thread(td3).start();
    }
}
