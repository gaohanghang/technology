## Java帝国之安全争斗

# 前言

在Java帝国第三代国王的推动下，帝国对臣民们提供了一个叫做Java 认证与授权服务（Java Authentication Authorization Service, 简称JAAS）的东西, 在第四代国王的争取下， JAAS成功地进入了JDK，成为了标准包的一部分。

国王希望JAAS能够一统安全领域，像JDBC那样引发使用的狂潮，成为一个重要的基础设施，特意设置了一个新职位JAAS大臣，任命了一个自己的心腹去推动这件事情。

可是希望越大，失望就越大，除了几家利益相关的豪门望族在不断地摇旗呐喊之外，臣民们对JAAS不屑一顾，没多少人使用。

## **雷秀才**

IO大臣这一天在家里闲得无聊， 带着忠心耿耿的幕僚InputReader 出去微服私访，来到了京城一个著名的酒馆，点了几样精致小菜，一壶美酒。还没开吃，就看到邻桌的一个书生在唉声叹气。

IO大臣心中一动，就把他叫过来一起聊聊。

原来这位书生是雷秀才，说是家乡赋税沉重，都没法活下去了，特意来京城上访，无奈不得其法，连门都进不去。

IO大臣起了好奇心，忙问是怎么回事。

雷秀才说：“都是JAAS惹得祸。”

“JAAS？”

“就是认证和授权嘛！”  雷秀才看到对方不知道，略有失望之色。

“认证？ 授权？”

“认证就是确定**你是谁**， 通常需要验证对方提供的用户名和密码。  授权就是确定**你能做什么**。比如能否创建账号，能够删除用户等等。”

“呃呃，想起来了，为什么不用官方的JAAS，帝国的标准还是挺好的嘛，比如JDBC。”

“老先生您有所不知，JDBC标准自然是没得说， 但是这个JAAS，唉，用起来极为繁琐，大家都不愿意使用。可是那个JAAS大臣根本不管这些，一直疯狂地推广JAAS， 如果不用，就要课以重税， 我们都活不下去了。”

“这倒是有点麻烦，你们打算怎么办？”  IO大臣先去试探对方套路。

雷秀才压低了声音：“不瞒老先生，我们家族已经推出了一个新的认证和授权的系统，叫做JSecurity，想托京城的大人们献给陛下，把JAAS替换掉。 ”

“哦？！”  IO大臣坐直了身体，这可是一件大事！

## **JSecurity**

O大臣和InputReader 交换了一下眼色： 一个新的机会到来了！

之前和线程大臣斗，和XML大臣斗，和JDBC/JTA大臣斗，打来打去，杀来杀去，自己也占不到什么便宜。

这一次也许可以把安全领域给抓住！

InputReader问道： “你说说这个JSecurity有什么好处？ ”

“简单，灵活，好用！比JAAS好用多了！” 雷秀才说。

“太抽象了，来点干货。”

雷秀才突然警惕起来，只是喝酒，笑而不语。

IO大臣决定打开天窗说亮话： “不瞒你说，我就是当朝的IO大臣，你不用怕，我可以帮你上奏陛下。”

“啊？！” 雷秀才满脸惊诧之色，没想到在这里竟然偶遇当朝大员， 看来上午去庙里拜佛是对的，赶紧站起来行礼： “失敬失敬！”

IO大臣说：“现在可以聊聊你的JSecurity了吧？”

雷秀才早有准备，从袖子中抽取出两张写满了代码的纸，呈给IO大臣和InputReader：

```java
Subject currentUser = SecurityUtils.getSubject();

UsernamePasswordToken token = new UsernamePasswordToken("liuxin", "123456");

currentUser.login( token );

if (currentUser.hasRole( "admin" )) {
    logger.info("You're Administrator!" );
}

if (currentUser.isPermitted( "user:delete" )) {
    logger.info("You can delete any users! be careful!");
}
currentUser.logout();
```

IO大臣戴上老花镜，举着纸看了半天：“你这里为什么叫做**Subject**啊？ 怎么不叫User?”

“回大人，这个Subject 是安全领域的一个术语，表示了所谓的‘主体’，既可以代表用户，也可以代表程序（网络爬虫等），我老家的人也觉得这个术语有点难于理解，也想用User这样通俗易懂的说法，但是考虑到现在很多系统中都有User这个概念，为了避免冲突，还是叫做Subject好了。 ”

InputReader问道：“你那个login方法，要是登录失败了怎么办？ ”

“其实那个方法会抛出异常，需要应用程序处理，我们提供了很多Exception类，分别应对各种情况，比如账号未知( UnknownAccountException) , 密码不正确(IncorrectCredentialsException) , 账户已锁(LockedAccountException) ,  尝试次数太多(ExcessiveAttemptsException) 等等。 “

IO大臣说：“但是程序给用户提供错误消息时，一定要提供模糊的信息，不能被别有用心的人利用，对吧？”

“没错，大人，给用户看的错误消息一定得是模糊的，例如： 用户名或者密码不正确。 ” 雷秀才看到IO大臣开始深入思考了，非常高兴。

“这里可以判断一个用户拥有什么角色(Role)， 以及有什么权限(Permission)，这个角色和权限直接有什么关系啊？ ”  InputStream继续问道。

“这个比较简单，**角色可以简单地认为是一些权限的集合**，比如admin这个角色，它的权限可能有删除用户，查看用户，修改用户等，再比如viewer这个角色，可能只有查看用户的权限了。”

“那个**user:delete**又是什么意思？” IO大臣目光如炬 。

按照以往的宫廷斗争经验，这些细节非得搞清楚不可，要不然被别人抓住把柄，在朝堂上可下不来台，文武大臣们表面上不动声色，心里早已把你鄙视千百遍了，自己可不能重蹈JTA大臣的覆辙。

（传送门： [Java帝国之宫廷内斗(1)](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513810&idx=1&sn=bbdc5d1f91bc4be2e73de871f0679f90&chksm=80d67b11b7a1f207b5ab4db1e429a1eafb4efadf183bea636db59bc22d63ee005768b05b9368&scene=21#wechat_redirect)， [Java帝国之宫廷内斗(2)](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513813&idx=1&sn=367c6fa224d2a82b721110611b62f5a6&chksm=80d67b16b7a1f200f48658c4f328125e86e7b4b66f5039dc334ee704a7c61242bfbf2c2e38ce&scene=21#wechat_redirect)）

雷秀才道：“那是我们定义的一种**权限符号规则**，格式是这样的：**资源:操作:实例**， 用两个冒号分开，例如：

user:create:U001 表示对用户资源实例U001进行create操作

user:create 表示对资源进行create操作，相当于user:create:*

user:*:U001    表示对用户资源实例01进行所有操作”

IO大臣点了点头，格式由JSecurity定义，但是数据内容需要应用程序来确定。

InputReader突然说：“大人您记得提出Java注解的安翰林吗， 如果这个JSecurity支持注解就好了。”

（传送门： [Java注解是怎么成功上位的？](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513930&idx=1&sn=f1f345124124958ca798460839cbbd17&chksm=80d67b89b7a1f29f18b099c7e57c117a050be6dc9575b780bef8706d4749fd648ba4e11c0a79&scene=21#wechat_redirect)）

雷秀才说：“支持支持，那个注解挺好用的。”

```java
@RequiresAuthentication
public void updateAccount(Account userAccount) {
    //用户认证了以后才可以执行该方法
    ...
}

@RequiresPermissions("account:create")
public void createAccount(Account account) {
    //用户必须具备account:create这个权限
    //才能执行该方法
    ...
}

@RequiresRoles("admin")
public void deleteUser(User user) {
    //只有具备admin这个角色的用户才能执行该方法
    ...
}
```

IO大臣觉得此处耳目众多，不宜久留，提议回自己府上继续商谈。

## Realm

三人回到IO大臣府中，还没等上茶，InputReader就着急地问道：“你那个代码看起来挺简单，只是JSecurity去哪里验证这些用户名，密码，还有权限，角色啊？”

看到问题越来越深入，雷秀才也越来越高兴，看来今天真的遇到贵人了。

“这真是一个好问题啊，大人，” 雷秀才说道， “对于每个应用来说，这些安全相关的数据保存的地方可能都不一样，可能在文本文件中， 数据库中，或者LDAP服务器中......  数据格式也不尽相同，有的把用户叫做user, 有的可能叫做username, 有些把密码叫做password,有些可能叫做pwd......  考虑到我们JSecurity是个框架，非得做出一个抽象的概念才行，这个概念就叫做**Realm** ，听起来也稍微有点古怪。”

雷秀才不好意思地笑了笑，继续往下说：“这个Realm 是一个接口，就像一座桥梁，把应用程序特定的数据和我们JSecurity框架能理解的格式给联系起来！ 它可以把用户应用特有的安全数据转化成JSecurity能理解的格式。”



![mark](http://omi0o6pp2.bkt.clouddn.com/blog/180319/g0ikbGb9c1.png)

“ 难道每个应用都得提供一个独特的JDBCRealm/LDAPRealm/IniRealm这样的实现类吗？ ”  IO大臣表示不满。

“不不，”雷秀才急忙救火，“为了降低应用程序的负担，我们的JSecurity框架已经提供了这些缺省的实现，大家在使用的时候只要稍微做点调整就可以， 比如说大人您有个应用程序，用数据库表存储了用户名和密码，usesr(id ,name, pwd......), 您只要提供一个sql 给JDBCRealm，我们框架就可以自动完成认证了。”

雷秀才又抛出了一张图。

![mark](http://omi0o6pp2.bkt.clouddn.com/blog/180319/f6eIkBlBl3.png)



InputReader 看着这张图，自动脑补了整个认证的过程：

1. 应用配置使用JDBCRealm （当然得提供数据库的连接信息)

2. 应用告诉JSecurity 怎么从用户表中根据用户名获取password，关键是那条sql：

   jdbcRealm.authenticationQuery = select pwd from users where name= ?

3. 用户执行subject.login操作，JSecurity 使用SQL进行查询，看看用户名，密码是否匹配数据库的值。

（注： 简单起见，这里故意忽略了使用salt对密码做hash的场景）

对于角色和权限，也可以提供类似的sql ，让JSeurity从数据库表中获取相关的数据：

jdbcRealm.userRolesQuery = "SELECT role_name FROM user_roles WHERE user_name = ?"

jdbcRealm.permissionsQuery = "SELECT permission FROM roles_permissions WHERE role_name = ?"



“一个应用程序要是配置了多个Realm ，认证时该怎么处理？”  InputReader继续刨根问底。

雷秀才暗自佩服InputReader心思缜密， 说道：“我们定义了一个接口，叫做AuthenticationStrategy， 用来定义认证多个Realm时该怎么处理， 我们也提供了几个默认的实现，比如FirstSuccessfulStrategy，只要遇到一个Realm认证成功就算成功；或者AllSuccessfulStrategy，必须所有的Realm都认证成功。”

InputReader点点头，看来他们考虑得挺仔细。很明显，对于授权，也可以定义类似的策略。

雷秀才画了一张图，展示了认证和授权的架构：

![mark](http://omi0o6pp2.bkt.clouddn.com/blog/180319/bb3eIbE10c.png)



## Session管理

“嗯，我觉得对于认证和授权，你们做得很不错了！”  IO大臣试图总结。

“大人，我们还支持一些很诱人的功能。例如Session管理。 ”

“Session ？ 那不是Tomcat之类的 Web Container要做的事情吗？”  InputReader 问道。

“是啊，所以一般情况下，你想用Session，必须得有个像Tomcat, Jetty这样的Web Container才行，但是如果你使用了我们的JSecurity， 根本不用什么Tomcat, Jetty，我们对Session内置是支持的，也就是说即使是桌面应用，也可以使用Session：”

```java
Subject currentUser = SecurityUtils.getSubject();
Session session = currentUser.getSession();
session.setAttribute( "someKey", someValue);
```

“这是个不错的卖点啊！” InputReader 对IO大臣使眼色。

“还有什么功能？ ” IO大臣胃口不小。

“我们还提供了一些工具类，可以进行加密， 当然了，我们还对Web开发提供了强大的支持。”

“大人，属下觉得这个API设计得确实挺简单的，比那个JAAS清爽多了”。InputReader对IO大臣说道。

## **尾声**

IO大臣很高兴，意气风发，充满正义，他铿锵有力地说：“  我们陛下乃一代圣君，但是被JAAS这些大臣给蒙蔽了，这样下去，民不聊生，Java帝国就要亡了，明天老夫就去参它一本！”

雷秀才看到当朝大员肯为自己出头，感动得无以复加。

可是InputReader拉过IO大臣悄悄地说：“大人，这个JAAS历经两代国王的努力才进入JDK， 充分代表了豪门望族的利益，再说JAAS大臣是国王身边的红人， 不可能说废就废，您要这么上奏，肯定碰钉子， 还得曲线救国。”

“曲线救国？”

“属下建议先让这个JSecurity 开源了， 让它加入著名的民间组织Apache，先让臣民们用起来，咱们暗中再资助一下，这么好用的东西肯定能形成气候， 等到呈星火燎原之势，我们的陛下也不得不让步，到时候JAAS大臣估计就要倒台了。”

IO大臣点头赞许。

第二天，雷秀才被送往Apache , 在那里JSeurity被改名为Shiro，开始向民间传播。

果然，几年以后，越来越多的人喜欢上了Shiro, JAAS备受冷落，国王见状，只好让JAAS大臣回家养老去了。

相关阅读：

- [Java：一个帝国的诞生](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513103&idx=1&sn=56d832072a92e3f41f5e6796676993e0&scene=21#wechat_redirect)

- [持久化：Java帝国反击战](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513794&idx=1&sn=b157e7638f8601bd6d4d9c811fd8696d&chksm=80d67b01b7a1f217e6d6b5dd9a800d2b3631ab51f79453bdbdb623671df3bccd9e94b0a868c8&scene=21#wechat_redirect)

- [Java帝国之宫廷内斗(1)](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513810&idx=1&sn=bbdc5d1f91bc4be2e73de871f0679f90&chksm=80d67b11b7a1f207b5ab4db1e429a1eafb4efadf183bea636db59bc22d63ee005768b05b9368&scene=21#wechat_redirect)

- [Java帝国之宫廷内斗(2)](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513813&idx=1&sn=367c6fa224d2a82b721110611b62f5a6&chksm=80d67b16b7a1f200f48658c4f328125e86e7b4b66f5039dc334ee704a7c61242bfbf2c2e38ce&scene=21#wechat_redirect)

- [Java注解是怎么成功上位的？](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513930&idx=1&sn=f1f345124124958ca798460839cbbd17&chksm=80d67b89b7a1f29f18b099c7e57c117a050be6dc9575b780bef8706d4749fd648ba4e11c0a79&scene=21#wechat_redirect)

- [Java帝国之泛型](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665514015&idx=1&sn=12409f705c6d266e4cd062e78ce50be0&chksm=80d67c5cb7a1f54a68ed83580b63b4acded0df525bb046166db2c00623a6bba0de3c5ad71884&scene=21#wechat_redirect)

- [Java帝国之动态代理](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513926&idx=1&sn=1c43c5557ba18fed34f3d68bfed6b8bd&chksm=80d67b85b7a1f2930ede2803d6b08925474090f4127eefbb267e647dff11793d380e09f222a8&scene=21#wechat_redirect)

- [Java帝国之消息队列](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513507&idx=1&sn=d6db79c1ae03ba9260fb0fb77727bb54&chksm=80d67a60b7a1f376e7ad1e2c3276e8b565f045b1c7e21ef90926f69d99f969557737eb5d8128&scene=21#wechat_redirect)

- [Java帝国之JMS的诞生](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513515&idx=1&sn=380bb1cb56d4151fd3acc5aa86f1da9a&chksm=80d67a68b7a1f37e3d98fe4495eab4db097eedd695c99fbd8704cc0464595842c4da598b99e3&scene=21#wechat_redirect)

  ​								（完）