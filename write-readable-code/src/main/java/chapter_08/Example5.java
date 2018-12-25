package main.java.chapter_08;

import java.util.SplittableRandom;

/**
 * 在方法/函数中提前返回
 * 最小化嵌套
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example5 {

    public boolean contains(String str, String subString) {
        if (str == null || subString == null) {
            return false;
        }
        if (subString.equals("")) {
            return true;
        }
        return str.indexOf(subString) != -1;
    }

    final int SUCCESS = 200;

    public void part1() {
        //int    userResult       = 200;
        //int    permissionResult = 300;
        //
        //String message          = "";
        //if (userResult == SUCCESS) {
        //    if (permissionResult != SUCCESS) {
        //        message = "没有权限阅读";
        //        return;
        //    }
        //    message = "";
        //} else {
        //    message = String.valueOf(userResult);
        //}
        //// 模拟使用 message
        //System.out.println(message);
    }

    public void part2() {
        int userResult = 200;
        int permissionResult = 300;

        String message = "";
        if (userResult != SUCCESS) {
            message = String.valueOf(userResult);
            // 模拟使用 message
            System.out.println(message);
            return;
        }
        if (permissionResult != SUCCESS) {
            message = "没有权限阅读";
            // 模拟使用 message
            System.out.println(message);
            return;
        }
        message = "";
        // 模拟使用 message
        System.out.println(message);
    }

}
