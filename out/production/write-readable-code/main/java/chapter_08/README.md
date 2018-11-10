# 简化流程让代码易读

| 编程结构 | 高层次程序流程是人如何变得不清晰的 | 
|-------|:--------:| 
| 线程 | 不清楚什么时候会执行代码 | 
| 信号量/中断处理程序 | 有些代码随时都有可能执行 | 
| 异常 | 可能会从多个函数向上冒泡的执行 | 
| 匿名函数 | 很难知道到底会执行什么代码，因为在编译器还未确定 |

# 总结

1. 写一个比较时，把改变的值放在左边，把稳定的值放在右边
2. 可以重新排列 if else 代码块，优先处理正确的、简单的逻辑。
有时这些准则会冲突，当不冲突时，遵循这些经验法则。
3. 像三目运算符、do while循环经常会导致代码可读性变差。最好不要使用它们，
因为总是有更整洁的方式。
4. 嵌套的代码块需要花一些时间去理解。每层新的嵌套都会给读者“思维栈” push 
一条数据。应该让它们变得“线性”，来避免深层嵌套。
5. 提早返回可以让代码更整洁。