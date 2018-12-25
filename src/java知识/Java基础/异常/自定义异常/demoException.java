package java知识.Java基础.异常.自定义异常;

/**
 * @author GaoHangHang
 * @date 2018/06/17 21:49
 **/
public class demoException extends Exception { //自定义异常类继承于Exception类
    public demoException() { //无参构造方法

    }

    public demoException(String me) { //有参构造方法
        super(me);//调用父类构造方法并传参数进去
    }
}
