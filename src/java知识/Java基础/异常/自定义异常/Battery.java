package java知识.Java基础.异常.自定义异常;

/**
 * @author GaoHangHang
 * @date 2018/06/15 23:22
 **/
public class Battery {
    /**
     * increase battery 充电
     */
    public void chargeBattery(double p) {
        // power <= 1
        if (this.power + p < 1.) {
            this.power = this.power + p;
        }else {
            this.power = 1.;
        }
    }

    /**
     * consume battery 使用电池
     */
    public boolean useBattery(double p) {
        try {
            test(p);
        } catch (Exception e) {
            System.out.println("catch Exception");
            System.out.println(e.getMessage());
            p = 0.0;
        }

        if (this.power >= p) {
            this.power = this.power - p;
            return true;
        }else {
            this.power = 0.0;
            return false;
        }
    }

    /**
     * test usage
     */
    private void test(double p) throws Exception{  // I just throw, don't handle
        if (p<0){
            Exception e = new Exception("p must be positive");
            throw e;
        }
    }

    /*
        useBattery()表示使用电池操作。useBattery()方法中有一个参数，表示使用的电量。
        我们使用test()方法测试该参数。如果该参数为负数，那么我们认为有异常，并抛出。


        在test中，当有异常发生时(p < 0)，我们创建一个Exception对象e，并用一个字符串作为参数。字符串中包含有异常相关的信息，
        该参数不是必需的。使用throw将该Exception对象抛出。

        我们在useBattery()中有异常处理器。由于test()方法不直接处理它产生的异常，而是将该异常抛给上层的useBattery()，
        所以在test()的定义中，我们需要throws Exception来说明。

        (假设异常处理器并不是位于useBattery()中，而是在更上层的main()方法中，
        我们也要在useBattery()的定义中增加throws Exception。)

        在catch中，我们使用getMessage()方法提取其异常中包含的信息。上述程序的运行结果如下:

        catch Exception
        p must be positive
     */

    private double power = 0.0; // percentage of battery
}
