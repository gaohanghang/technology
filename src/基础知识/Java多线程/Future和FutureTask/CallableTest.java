package 基础知识.Java多线程.Future和FutureTask;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.Future;
    /**
     * @author zejian
     * @time 2016年3月15日 下午2:05:43
     * @decrition callable执行测试类
     */
    public class CallableTest {

        public static void main(String[] args) {
            //创建线程池
            ExecutorService es = Executors.newSingleThreadExecutor();
            //创建Callable对象任务
            CallableDemo calTask=new CallableDemo();
            //提交任务并获取执行结果
            Future<Integer> future =es.submit(calTask);
            //关闭线程池
            es.shutdown();
            try {
                Thread.sleep(2000);
            System.out.println("主线程在执行其他任务");

            if(future.get()!=null){
                //输出获取到的结果
                System.out.println("future.get()-->"+future.get());
            }else{
                //输出获取到的结果
                System.out.println("future.get()未获取到结果");
            }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("主线程在执行完成");
        }
    }
