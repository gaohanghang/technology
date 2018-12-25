package 基础知识.单例模式的五种方式;

// 单例设计方案五(采用延迟加载策略优化设计方案四)
class Singleton05 {

    private Singleton05() {
    }

    static class Lazy {// 类何时被加载
        public static final Singleton05 instance = new Singleton05();
    }

   /* public static Singleton05 getInstance() {
        // 何时需要用时加载
        return Lazy.instance;
    }*/
    // 请问访问Singleton05类的这个方法时候会加载Lazy吗?
    // public static void display(){}
    // 请问访问Singleton05类的show方法时是否需要加载Lazy?
    // public void show(){}

}
