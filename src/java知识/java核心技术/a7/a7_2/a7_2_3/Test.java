package java知识.java核心技术.a7.a7_2.a7_2_3;

import javax.servlet.ServletException;
import java.sql.SQLException;

/**
 * @Description: 再次抛出异常与异常链
 * @author: Gao Hang Hang
 * @date 2018/12/29 17:34
 */
public class Test {
    public static void main(String[] args) throws ServletException {
        try {
            // access the database
            throw new SQLException();
        } catch (SQLException e) {
            throw new ServletException("database: " + e.getMessage());
        }
    }
}
