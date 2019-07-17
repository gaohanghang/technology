---
title: 用了 Lambda 之后，发现可以忘记设计模式了
date: 2019-07-12 18:30:22
tags:
	- java
---

> 原文地址: https://mp.weixin.qq.com/s/Xj4wjzfVkFJz8HWKahjmhA

设计模式是过去的一些好的经验和套路的总结，但是好的语言特性可以让开发者不去考虑这些设计模式。面向对象常见的设计模式有策略模式、模板方法、观察者模式、责任链模式以及工厂模式，使用Lambda表达式（函数式编程思维）有助于避免面向对象开发中的那些固定代码。下面挑选了策略模式和职责链模式两个案例进行分析。

## 案例1：策略模式

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190712183208.png)

当我们解决一个问题有不同的解法的时候，又不希望客户感知到这些解法的细节，这种情况下适合使用策略模式。策略模式包括三个部分：

- 解决问题的算法（上图中的Strategy）；
- 一个或多个该类算法的具体实现（上图中的ConcreteStrategyA、ConcreteStrategyB和ConcreteStrategyC）
- 一个或多个客户使用场景（上图中的ClientContext）

### 面向对象思路

首先定义策略接口，表示字符串的处理算法：

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190713114605.png)

然后定义具体的实现类，即不同的验证算法：

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190713114625.png)

最后定义客户使用场景，代码如下图所示。Validator是为客户提供服务时使用的上下文环境，每个Valiator对象中都封装了具体的Strategy对象，在实际工作中，我们可以通过更换具体的Strategy对象来进行客户服务的升级，而且不需要让客户进行升级。

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190713114658.png)

### 函数式编程思路 

如果使用Lambda表达式考虑，你会发现ValidationStrategy就是一个函数接口（还与Predicate具有同样的函数描述），那么就不需要定义上面那些实现类了，可以直接用下面的代码替换，原因是Lambda表达式内部已经对这些类进行了一定的封装。

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114412.png)

## 案例2：责任链模式

在某些场景下，需要对一个对象做一系列的工作，这些工作分别是由不同的类完成的，这时候就比较适合使用责任链模式。责任链模式的主要组成部分包括三个：

- 管理操作序列的抽象类，在该抽象类里有会有一个对象记录当前对象的后继操作对象；
- 一些具体的操作对象，这些操作对象会以一个链表的形式组织起来
- 一个使用该模式的客户端组件，该组件只需要跟一个组件打交道就好，不需要跟很多个操作对象耦合在一起。

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114433.png)

### 面向对象思路 

首先看下我们这里定义了一个抽象类ProcessingObject，其中successor字段用于管理该对象的后继操作对象；handle接口作为对外提供服务的接口；handleWork作为实际处理对象的操作方法。

<!-- more -->

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114448.png)

接下来可以定义两个具体的操作对象，如下面代码所示。PS：这里《Java 8实战》书中用的是replaceAll方法是不太合适的，这个点可以参考我们之前的文章——[020：举几个String的API以及案例](http://mp.weixin.qq.com/s?__biz=MzIwMjA3MDE3MQ==&mid=2650737646&idx=1&sn=d96d2ffb4dc782a0d79831b6879045c0&chksm=8eefea1ab998630c13114e340f7406154b64e40fe49247242c8edd9d129fef3c7345040e8672&scene=21#wechat_redirect) )。

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114506.png)

最后，你就可以在Client中将这上面两个具体的操作类对象构成一个操作序列，参见下面的代码：

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114522.png)

### 函数式编程思路 

如果使用函数式编程思维，那么职责链模式就直接了——y=f(x)和z=g(x)这两个方法都是要对x做处理，那么如果将这两个函数组合在一起，就会形成r=f(g(x))的情况，也就是可以使用Lambda表达式中的addThen来串联起多个处理过程。

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114539.png)

上面是利用Java原生的Lambda表达式实现的职责链模式，我们也可以使用前面一篇文章——[vavr：让你像写Scala一样写Java](http://mp.weixin.qq.com/s?__biz=MzIwMjA3MDE3MQ==&mid=2650737831&idx=1&sn=a69429f03f3669b33f0c3a75c4378701&chksm=8eefed53b998644589fc3040ca6c1dc04154d832d8e353639a67b1dd3f69e94b1502e1fa8579&scene=21#wechat_redirect))中介绍过的vavr库来实现，代码如下所示：

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190714114555.png)

## 总结

可以看出，函数式编程思维跟面向对象编程思维的思考方式是不同的，表达力更强，因此，作为开发者是时候认真学习下函数式编程思维了，作为Java开发者，我准备先从Lambda表达式开始学起。