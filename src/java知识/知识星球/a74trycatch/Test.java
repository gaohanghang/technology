package java知识.知识星球.a74trycatch;

/**
 * @author GaoHangHang
 * @date 2018/06/20 17:02
 **/
public class Test {
    public static void test() {
        try{
            System.out.println("--------try---------");
            System.exit(0);
        }finally {
            System.out.println("------ finally------");
        }
    }

    public static void main(String[] args) {
        test();
    }

}
