package 基础知识.Java多线程.Java线程间通信方式;

/**
 * 一个展示Thread.stop()方法为什么被弃用的例子
 * @author RJH
 * @date 2017年12月11日 下午7:48:00
 */
public class StopDemo {

	public static void main(String[] args) {
		StopThread thread=new StopThread();
		thread.start();
		try {
			//休眠1秒，确保i变量自增成功
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//一般会处理中断异常，这里作为例子就直接打印到控制台了
			e.printStackTrace();
		}
		//暂停线程
		thread.stop();
		while(thread.isAlive()){//确保线程已经终止

		}
		//输出结果
		thread.print();
	}
	/**
	 * 展示用的例子，内部对两个整数做自增
	 * @author RJH
	 * @date 2017年12月11日 下午7:48:32
	 */
	private static class StopThread extends Thread{

		private int i=0;

		private int j=0;

		@Override
		public void run(){
			synchronized (this) {//增加同步锁，确保线程安全
				++i;
				try {
					//休眠10秒,模拟耗时操作
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				++j;
			}
		}
		/**
		 * 打印i和j
		 */
		public void print(){
			System.out.println("i="+i+" j="+j);
		}
	}
}
