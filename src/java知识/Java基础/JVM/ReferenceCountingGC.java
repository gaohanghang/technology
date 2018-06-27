package java知识.Java基础.JVM;

/**
 * @author GaoHangHang
 * @date 2018/06/23 19:10
 **/
public class ReferenceCountingGC {

    public Object instance = null;

    public static void testGC() {

        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        // 对象之间相互循环引用，对象objA和objB之间的引用计数永远不可能为0

        objB.instance = objA;
        objA.instance = objB;

        objA = null;
        objB = null;

        objA = null;
        objB = null;

        System.gc();
    }
}
