package java核心技术卷1.a7.a7_2.a7_2_3;

import javax.servlet.ServletException;
import java.sql.SQLException;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/29 17:36
 */
public class test2 {
    public static void main(String[] args) throws Throwable {
        try {
            // access the database
            throw new SQLException();
        } catch (SQLException e) {
            Throwable se = new ServletException("database error");
            se.initCause(e);
            throw se;
        }
    }
}
