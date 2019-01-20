package java知识.尚学堂.多线程.Thread_study01;

/**
 * @Description: 图片下载
 * @author: Gao Hang Hang
 * @date 2019/01/19 15:10
 */
public class TDownloader extends Thread {
    private String url; // 远程路径
    private String name; // 存储名字

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader wd = new WebDownloader();
        wd.download(url, name);
    }

    public static void main(String[] args) {
        TDownloader td1 = new TDownloader("https://img1.doubanio.com/view/note/l/public/p56831139.webp", "1.webp");
        TDownloader td2 = new TDownloader("https://img3.doubanio.com/view/note/l/public/p56831141.webp", "2.webp");
        TDownloader td3 = new TDownloader("https://img1.doubanio.com/view/thing_review/l/public/p1967527.webp", "3.webp");

        // 启动三个线程
        td1.start();
        td2.start();
        td3.start();
    }
}
