# Commons.lang工具

> 原文链接：[www.begincode.net](https://link.juejin.im/?target=http%3A%2F%2Fwww.begincode.net%2Fblog%2F163)

> 1.ArrayUtils


Apache Commons是一个非常有用的工具包，解决各种实际的通用问题，项目提供了相当丰富的API。我们了解到的Commons Lang只是众多API的比较核心的一小部分而已。

commons.lang跟java.lang这个包的作用类似，Commons Lang这一组API也是提供一些基础的、通用的操作和处理，处理String、数组操作、枚举、日期和时间的处理等等。接下在这里介绍Commons下的lang包。

## ArrayUtils

数组是我们经常需要使用到的一种数据结构，Java本身并没有提供很好的API支持，就导致很多操作很繁琐。而现在通过运用ArrayUtils这个类对数组的处理，可以减少很多麻烦。至于麻烦有哪些？举个例子：数组的长度是固定的。

```
// 合并两个数组 （也可以理解为添加多个数据，后面的add是添加单个数据）    

int[] a = new int[] { 1, 3, 5 };     

int[] b = new int[] { 2, 4 };

ArrayUtils.addAll( a , b);

//结果{1,3,5,2,4}
```

下面这两个是不借助工具我的写法，两种方法。

```java
//这两种都是不考虑为null的情况下     

//这个方法也是addAll底层所采用的方法 

int[] c= new int[a.length+b.length];   

System.arraycopy(a, 0, c, 0,a.length);    

System.arraycopy(b, 0, c, a.length, b.length);

//这个就是比较普通了，想到比较多的吧  

int j = 0;     

for (int i = 0; i < c.length ; i++) {          

if(i < a.length) {

    c[i] = a[i];         

}else {

    c[i] = b[j];

    j++;          

}      

}
```

添加多个数据当然有添加单个数据

```java
// 添加一个数据到数组
ArrayUtils.add(new int[] { 1, 3, 5 } , 4);
//结果 {1,3,5,4}
```

## StringUtils

Java中我们用的最多的类应该就是String了，要知道 String为不可变对象，如果要是对字符串内容进行操作就可以使用

到StringBuffer。那接下来说下我们要介绍的StringUtils，StringUtis是处理String的一个工具类，而在其中用的最多的也

是StringBuffer。

```java
//数组元素拼接
String[] array = {"aaa",
"bbb", "ccc"};
StringUtils.join(array, ","); 
//结果"aaa,bbb,ccc"
```

```java
//对比版，也是简陋版。
StringBuffer buf = new StringBuffer();
for (int i = 0; i < array.length; i++) {
     buf.append(array[i]+",");
}
```

工具类封装基本方法和大家想的差不多。但是工具类里面加了一些判断，避免出现错误。向上面的ArrayUtils，我里面自己的例

子说没判断null的情况，而在工具类中是有这个判断的。所以说工具类除了实现减少 重复代码，更重要的就是增加了代码的安

全性。具体体现放在最后了，想了解更多可以看看源码。

接下来介绍个差不多的。

```java
//集合元素拼接
List<String> list = new
ArrayList<String>();
list.add("aaa");
list.add("bbb");
list.add("ccc");
StringUtils.join(list,",");
//结果"aaa,bbb,ccc"
```

#### 对于null的处理commons的方式还是很不错的。

```java
//对null处理，给予自定义字符
StringUtils.defaultString(String str, String defaultStr)
//结果为defaultStr
```

### 以及对应的ObjectUtils中的方法。

```
ObjectUtils.defaultIfNull(null, "空")//结果 空
```

其他的一些工具方法

```
//  ”” 和 null 为true 这个判断是用的计较多的，底层是计算长度。
StringUtils.isEmpty()
```

```
//检查一字符串是否为另一字符串的子集
StringUtils.containsOnly("","aaaad")
 //结果true
```

```
//去除字符中的空格
StringUtils.deleteWhitespace("aa  bb cc")
//结果aabbcc
```

​      

判断是否是某类字符（判断的一系列小工具）

```
//是否为字母
StringUtils.isAlpha("ab");
//true  null为false  Character.isLetter(str.charAt(i))  

```

```
//是否为字符或数字
StringUtils.isAlphanumeric("a11");
//true  nul为false   
```

```
// 是否为空
StringUtils.isBlank("");
//true  ""和null为true  
//是否是数字
StringUtils.isNumeric("123");
//true  null false  

//去除字符串中的"\n", "\r", or "\r\n"
StringUtils.chomp("abc\r\n");
//---"abc"
```

## Time

时间类处理工具

 

```
//格式化日期输出
DateFormatUtils.format(System.currentTimeMillis(),"yyyy-MM-dd HH:mm:ss")
//结果2016-12-11 18:47:07
```

 

```
//秒表
StopWatch sw = new StopWatch();     
sw.start();   
sw.stop();
sw.getTime()
```

## CharSetUtils

看名字，字符处理工具。

```
//计算字符串中包含某字符数
CharSetUtils.count("new Date(millis), pattern, DateUtils.UTC_TIME_ZONE, locale.", "aeiou");
//结果13

//删除字符串中某字符
CharSetUtils.delete("new Date(millis), pattern, DateUtils.UTC_TIME_ZONE, locale.", "aeiou");
 //结果nw Dt(mlls), pttrn, DtUtls.UTC_TIME_ZONE, lcl

//保留字符串中某字符
CharSetUtils.keep("new Date(millis), pattern, DateUtils.UTC_TIME_ZONE, locale.", "aeiou");
//结果eaeiiaeaeioae

//合并重复的字符
CharSetUtils.squeeze("a  bbbbbb    
c dd", "b d");
//结果a b c d
```

 补充

 

Commons中很多的工具方法除了减少重复造轮子之外，大多是加入了验证，避免了一些可能出现异常和错误，举个例子：

String.substring();

StringUtils.substring();

```
这里给重载方法中的一个源码。
public static String substring(String str,int start) {     
if(str == null) {        
   return null;    
} else {        
   if(start < 0) {
       start += str.length();          
   }          
if(start < 0) {     
    start = 0;         
}        
return start > str.length()?"":str.substring(start);      
        }
}
```

之后说一下重载，在commons工具类中用到重载的地方特别多，重载的特性在这里有了很好的解释。

# 结束

贴的方法不是很多，会把接下来的项目用到的其他的方法也放进来。

作者(Zhang7)