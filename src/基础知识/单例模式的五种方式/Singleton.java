package 基础知识.单例模式的五种方式;

/**
 * 双重校验锁实现单例模式
 */
public class Singleton {

	// volatile 是防止指令重排
	private static volatile Singleton singleton;

	private Singleton() {}

	public static Singleton getInstance() {
		// 第一层判断 singleton 是不是为 null
		// 如果不为 null 直接返回，这样就不必加锁了
		if (singleton == null) {
			// 现在再加锁
			synchronized(Singleton.class) {
				// 第二层判断
				// 如果 A,B 两个线程都在synchronized等待
				// A 创建完对象之后，B 还会再进入，如果不再检查一遍，B又会创建一个对象
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
