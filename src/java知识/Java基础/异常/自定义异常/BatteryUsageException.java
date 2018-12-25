package java知识.Java基础.异常.自定义异常;

/**
 * @author GaoHangHang
 * @date 2018/06/15 23:34
 **/
public class BatteryUsageException extends Exception {
    // 重写构造方法

    // 无参构造器
    public BatteryUsageException() {
    }

    // 有参构造器
    public BatteryUsageException(String msg) {
        super(msg);
    }
}
