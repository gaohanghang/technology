package 基础知识.Java基础.BigDecimal;

import java.math.BigDecimal;

/**
 * 参数为
 * @author GaoHangHang
 * @date 2018/07/27 14:21
 **/
/*
         输出结果

         construct with a doublevalue:1.2199999999999999733546474089962430298328399658203125

         construct with a String value: 1.22

         1、参数类型为double的构造方法的结果有一定的不可预知性。
         有人可能认为在Java中写入newBigDecimal(0.1)所创建的BigDecimal正好等于 0.1（非标度值 1，其标度为 1），
         但是它实际上等于0.1000000000000000055511151231257827021181583404541015625。
         这是因为0.1无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。
         这样，传入到构造方法的值不会正好等于 0.1（虽然表面上等于该值）。

         2、另一方面，String 构造方法是完全可预知的：写入 newBigDecimal("0.1") 将创建一个 BigDecimal，它正好等于预期的 0.1。因此，比较而言，通常建议优先使用String构造方法。

         3、当double必须用作BigDecimal的源时，请注意，此构造方法提供了一个准确转换；它不提供与以下操作相同的结果：先使用Double.toString(double)方法，然后使用BigDecimal(String)构造方法，
         将double转换为String。要获取该结果，请使用static valueOf(double)方法。
 */
public class BigDecimalTest {

    public static void main(String[] args) {

        /*
        1.构造函数
         */
        BigDecimal aDouble = new BigDecimal(1.22);
        System.out.println("construct with a double value:" + aDouble);
        BigDecimal aString = new BigDecimal("1.22");
        System.out.println("construct with a String value:"+ aString);

        BigDecimal aDoubletoString = new BigDecimal(Double.toString(1.22));
        System.out.println("aDoubletoString"+aDoubletoString);

        /*
        2.加法操作

        减乘除其实最终都返回的是一个新的BigDecimal对象，
        因为BigInteger与BigDecimal都是不可变的（immutable）的，在进行每一步运算时，
        都会产生一个新的对象，所以a.add(b);虽然做了加法操作，但是a并没有保存加操作后的值，
        正确的用法应该是a=a.add(b);
         */
        BigDecimal a = new BigDecimal("1.22");
        System.out.println("construct with a String value:" + a);
        BigDecimal b = new BigDecimal("2.22");
        a.add(b);
        System.out.println("aplus b is:" + a);


        /*
        总结
        (1)商业计算使用BigDecimal。
        (2)尽量使用参数类型为String的构造函数。
        (3)BigDecimal都是不可变得(immutable)的，在进行每一步运算时，都会产生一个新的对象，
        所以在做加法乘法运算时千万要保存操作后的值。
        (4)我们往往容易忽略JDK底层的一些实现细节，导致出现错误，需要多加注意。
         */
    }

}
