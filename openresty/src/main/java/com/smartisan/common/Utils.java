package com.smartisan.common;


public class Utils {

    /**
     * 生成随机数(1-number区间)
     *
     * @param number 最大随机数
     */
    public static int single_random_number(int number) {
        int randomnumber = (int) (Math.random() * (number) + 1);//1到number
        return randomnumber;
    }

    /**
     * 生成多位数字组成的随机数(长度为len)
     *
     * @param len 随机数长度
     * @return
     */
    public static String multi_random_number(int len) {
        StringBuffer rt = new StringBuffer();
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                rt = rt.append((int) (Math.random() * 9 + 1));//1到9
            } else {
                rt = rt.append((int) (Math.random() * 10));//0到9
            }
        }
        return rt.toString();
    }

}
