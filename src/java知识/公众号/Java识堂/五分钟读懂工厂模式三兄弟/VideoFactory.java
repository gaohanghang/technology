package java知识.公众号.Java识堂.五分钟读懂工厂模式三兄弟;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/15 20:38
 */
public class VideoFactory {
    public static Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    // public static Video getVideo(Class c) {
    //     Video video = null;
    //     try {
    //         video = (Video) Class.forName(c.getName()).newInstance();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return video;
    // }
}
