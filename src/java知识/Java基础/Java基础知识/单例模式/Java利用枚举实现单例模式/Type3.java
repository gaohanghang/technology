package java知识.Java基础.Java基础知识.单例模式.Java利用枚举实现单例模式;

/**
 * @author GaoHangHang
 * @date 2018/08/26 15:03
 **/
public enum Type3 {
    A {
        public String getType() {
            return "A";
        }
    }, B {
        @Override
        public String getType() {
            return "B";
        }
    }, C {
        @Override
        public String getType() {
            return "C";
        }
    }, D {
        @Override
        public String getType() {
            return "D";
        }
    };

    public abstract String getType();
}
