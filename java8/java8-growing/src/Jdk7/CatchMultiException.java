package Jdk7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 捕获多异常
 *
 * @author GaoHangHang
 * @date 2018/07/03 10:39
 **/
public class CatchMultiException {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(""));
            Connection con = null;
            Statement stmt = con.createStatement();
        } catch (IOException | SQLException e) {
            //捕获多个异常，e就是final类型的
            e.printStackTrace();
        }
    }
}
