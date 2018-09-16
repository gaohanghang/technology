package main.java.chapter_09;

/**
 * 总结变量
 *
 * @author: Gao HangHang
 * @date 2018/09/16
 */
public class Example2 {

    class User {

        long id;

    }

    class Request {

        User user;

    }

    class Document {

        long owerId;
    }

    public void  part1(Request request, Document document) {
        if (request.user.id == document.owerId) {
            // 允许该用户编辑文档
        }
        if (request.user.id != document.owerId) {
            // 文档只读
        }
    }

    public void part2(Request request, Document document) {
        boolean userDownsDocument = (request.user.id == document.owerId);
        if (userDownsDocument) {
            // 允许该用户编辑文档
        }
        if (!userDownsDocument) {
            // 文档只读
        }
    }

}
