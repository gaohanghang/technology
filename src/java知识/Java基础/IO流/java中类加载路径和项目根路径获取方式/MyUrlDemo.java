package java知识.Java基础.IO流.java中类加载路径和项目根路径获取方式;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author GaoHangHang
 * @date 2018/06/07 16:54
 **/
public class MyUrlDemo {
    public static void main(String[] args) {
        MyUrlDemo myUrlDemo = new MyUrlDemo();
        try {
            myUrlDemo.showURL();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showURL() throws IOException {

        // 第一种：获取类加载的根路径    F:\IdeaProjects\technology\out\production\technology
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println(f);

        // 获取当前类的所在工作路径；如果不加“/” 获取当前类的加载目录 F:\IdeaProjects\technology\src\java知识\Java基础\IO流\java中类加载路径和项目根路径获取方式
        File f2 = new File(this.getClass().getResource("").getPath());
        System.out.println(f2);

        // 第二种：获取项目路径   F:\IdeaProjects\technology
        File directory = new File("");//参数为空
        String courseFile = directory.getCanonicalPath();
        System.out.println(courseFile);

        // 第三种：  file:/F:/IdeaProjects/technology/out/production/technology/
        URL xmlpath = this.getClass().getClassLoader().getResource("");
        System.out.println(xmlpath);

        // 第四种： F:\IdeaProjects\technology
        System.out.println(System.getProperty("user.dir"));
        /*
            结果：
            获取当前工程路径
         */

        // 第五种： 获取所有的类路径 包括jar包的路径  E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\charsets.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\deploy.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-32.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\javaws.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\jce.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\jfr.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\jsse.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\management-agent.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\plugin.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\resources.jar;E:\Program Files (x86)\Java\jdk1.8.0_144\jre\lib\rt.jar;F:\IdeaProjects\technology\out\production\technology;F:\IdeaProjects\technology\lib\algs4.jar;F:\IdeaProjects\technology\lib\commons-lang3-3.7.jar;E:\Program Files\JetBrains\IntelliJ IDEA 2018.1\lib\idea_rt.jar
        System.out.println(System.getProperty("java.class.path"));

    }
}
