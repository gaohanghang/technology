> 原文地址: [java 多线程之使用 interrupt 停止线程的几种方法](https://juejin.im/post/5ba062be6fb9a05cd84918b7)

总结

1. 使用退出标志，使线程正常退出，也就是当run方法完成后才停止；
2. 就是我们上面所说的使用stop方法强行终止线程，是过期作废的方法，这种方法可以排除不用；
3. 使用interrupt方法终止线程。
   - 异常法停止线程（推荐）
   - 在sleep()中停止线程
   - 使用return停止线程

## 停止线程

停止线程是java多线程开发中很重要的技术点，实际工作中很多业务都有类似的需求，掌握此技术可以对业务中所需停止的线程做有效的处理。但是停止线程在java语言中并不像break语句中那样干脆简单，还需要我们做一下技巧性的处理。 如何更好的停止一个线程是我们应该要考虑的问题，停止一个线程意味着在线程处理完任务之前停掉正在做的操作，即放弃当前的操作。停止一个线程在之前老的JDK中使用的是`Thread.stop()`方法，但是后面发现这种处理方法是很危险而且不安全的，由于stop()方法已经在JDK中被标明是“作废/过期”的方法，显然它在功能上是具有缺陷的。作为一个负责的java工程师，最好是不要去使用它，**因为使用stop()方法释放锁将会给数据造成不一致性的结果。如果出现这种情况，程序处理的数据可能遭到破坏，最终导致程序执行流程错误。**大多数停止一个线程的操作使用的是`Thread.interrupt()`方法，虽然方法名是“终止，停止”的意思，但是这个方法不会直接终止一个正在运行的线程还需要加入一个判断才可以完成线程的停止。 此外，在java中有以下的3种方法可以终止正在运行的线程：

1. 使用退出标志，使线程正常退出，也就是当run方法完成后才停止；
2. 就是我们上面所说的使用stop方法强行终止线程，是过期作废的方法，这种方法可以排除不用；
3. 使用interrupt方法终止线程。

第一种使用退出标志的方法楼主不做介绍，具体可以参考其他博客，都大同小异，楼主写这篇博客主要是探索使用interrupt停止线程的几种方法的优劣。

## 异常法停止线程

首先我们用for-break方式停止线程：

```
public class ExceptionInterrupt extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }

    public static void main(String[] args) {
        ExceptionInterrupt thread = new ExceptionInterrupt();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
复制代码
```

打印结果如下：

```
......
i=421200
i=421201
i=421202
i=421203
i=421204
i=421205
i=421206
i=421207
i=421208
i=421209
已经是停止状态了！我要退出了！
我被输出，如果此代码是for又继续运行，线程并未停止！
end!
复制代码
```

我们发现，上面的示例虽然停止了线程，但是如果for语句下面还有语句，那么还是会继续执行。所以我们这里用异常法来停止线程，就不会继续执行for后面的业务逻辑了。

```
public class ExceptionInterrupt2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进入ExceptionInterrupt2 类中run方法的catch了!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionInterrupt2 thread = new ExceptionInterrupt2();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();

        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

复制代码
```

打印结果如下：

```
......
i=96487
i=96488
i=96489
i=96490
i=96491
i=96492
i=96493
已经是停止状态了！我要退出了！
进入ExceptionInterrupt2 类中run方法的catch了!
java.lang.InterruptedException
	at com.thread.chapter1.ExceptionInterrupt2.run(ExceptionInterrupt2.java:20)
end!
复制代码
```

## 在sleep()中停止线程

如果线程在sleep()状态下停止线程，会有什么效果呢？我们来看下面的示例：

<!-- more -->

```
public class SleepInterrupt extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        try {
            SleepInterrupt thread=new SleepInterrupt();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
复制代码
```

执行结果如下：

```
run begin
end
在沉睡中被停止！进入catch!false
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at com.thread.chapter1.SleepInterrupt.run(SleepInterrupt.java:18)
复制代码
```

从执行结果来看，如果在sleep状态下停止某一线程，会进入catch语句，并且清除停止状态值，使之变为false。上面的示例是先sleep然后再用interrupt()停止，与之相反的操作也要注意。

```
public class SleepInterrupt2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止,再遇到了sleep!进入catch!");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SleepInterrupt2 thread = new SleepInterrupt2();
        thread.start();
        thread.interrupt();
        System.out.println("end");

    }

}

复制代码
```

执行结果如下：

```
......
i=99991
i=99992
i=99993
i=99994
i=99995
i=99996
i=99997
i=99998
i=99999
i=100000
run begin
先停止,再遇到了sleep!进入catch!
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at com.thread.chapter1.SleepInterrupt2.run(SleepInterrupt2.java:21)

复制代码
```

## 使用return停止线程

将方法interrupted()与return结合使用也能实现停止线程的效果。

```
public class ReturnInterrupt extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }
            System.out.println("time=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReturnInterrupt thread=new ReturnInterrupt();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}

复制代码
```

执行结果如下：

```
......
time=1536809054172
time=1536809054172
time=1536809054172
time=1536809054172
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
time=1536809054173
停止了！
复制代码
```

## 小结

上面几种方法都是通过使用interrupt停止线程，只是做了不同的技巧处理，不过建议使用“抛异常”的方法来实现线程的停止，因为在catch块中还可以将异常向上抛，使线程停止的事件得以传播。

## 参考

《java多线程编程核心技术》
