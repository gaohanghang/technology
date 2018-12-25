package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * @author: Gao HangHang
 * @date 2018/11/02
 */
public class Rentcar {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }

        //for (int i = 0; i < 8; i++) {
        //    for (int j = 0; j < 10; j++) {
        //        System.out.printf("%5d", i*j);
        //    }
        //    System.out.println();
        //}

        //int x = 12, y = 10;
        //System.out.printf("(%d,%d)", x, y);
    }
}
