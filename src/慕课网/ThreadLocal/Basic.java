package 慕课网.ThreadLocal;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-01-29 17:15
 **/
public class Basic {

    // ThreadLocal<T>
    public static ThreadLocal<Long> x = new ThreadLocal<Long>(){
        @Override
        protected Long initialValue() {
            System.out.println("Initial Value run..");
            return Thread.currentThread().getId();
        }
    };

    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                System.out.println(x.get());
            }
        }.start();
        x.set(107L);
        // 移除当前线程上的ThreadLocal的值
        x.remove();
         /*
            get操作会延迟加载，如果不get,不会触发initialValue
         */
        System.out.println(x.get());

    }

}
