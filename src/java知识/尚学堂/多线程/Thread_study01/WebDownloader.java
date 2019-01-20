package java知识.尚学堂.多线程.Thread_study01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 下载图片
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class WebDownloader {
    public void download(String url, String name) {
        try {
            //把URL 里面内容复制到文件。可以下载文件。
            //参数1：URL资源 ； 参数2：目标文件
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("不合法的url");
        } catch (IOException e) {
            System.out.println("下载失败");
        }
    }
}
