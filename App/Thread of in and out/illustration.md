## 目录
* [运行结果](#运行结果)
* [解释说明](#解释说明)
* [参考资料](#参考资料)
* [调试中遇到的问题的小结](#调试中遇到的问题的小结)
___
#运行结果
### 3个线程进水，2个线程排水 ###
	进水5立方米，水池容量15
	排水3立方米后容器容量9
	进水5立方米，水池容量15
	排水3立方米后容器容量12
	进水5立方米，水池容量15
	进水5立方米，水池容量19
	进水5立方米，水池容量19
	进水5立方米，水池容量23
	排水3立方米后容器容量21
	排水3立方米后容器容量18
	进水5立方米，水池容量23
	进水5立方米，水池容量28
	排水3立方米后容器容量24
	进水5立方米，水池容量27
	排水3立方米后容器容量24
	进水5立方米，水池容量37
	进水5立方米，水池容量37
	进水5立方米，水池容量42
	排水3立方米后容器容量39
	排水3立方米后容器容量36
	进水5立方米，水池容量41
	进水5立方米，水池容量46
	进水5立方米，水池容量48
	排水3立方米后容器容量48
	排水3立方米后容器容量45
	进水5立方米，水池容量55
	进水5立方米，水池容量55
	进水5立方米，水池容量58
	排水3立方米后容器容量57
	排水3立方米后容器容量54
	进水5立方米，水池容量64
	进水5立方米，水池容量64
	进水5立方米，水池容量69
	排水3立方米后容器容量66
	排水3立方米后容器容量63
	进水5立方米，水池容量70
	进水5立方米，水池容量73
	进水5立方米，水池容量75
	排水3立方米后容器容量75
	排水3立方米后容器容量72
	进水5立方米，水池容量79
	进水5立方米，水池容量82
	排水3立方米后容器容量80
	进水5立方米，水池容量84
	排水3立方米后容器容量81
	进水5立方米，水池容量91
	进水5立方米，水池容量91
	排水3立方米后容器容量93
	进水5立方米，水池容量93
	排水3立方米后容器容量90
	进水5立方米，水池容量100
	进水5立方米，水池容量100
	进水0立方米，水池容量100
	进水0立方米，水池容量100
	进水0立方米，水池容量100
	水池水已经满了
	进水线程success并终止
	排水进程success并终止
	进水线程success并终止
	进水线程success并终止
	排水进程success并终止
# 解释说明
* 运行结果解释</br>
对前5行代码分析

		进水5立方米，水池容量15
		排水3立方米后容器容量9
		进水5立方米，水池容量15
		排水3立方米后容器容量12
		进水5立方米，水池容量15
第一行进水5立方米，水池容量15,理论上应该是5，但是这里显示的是15，是因为输出容器容量的时候容器容量已经变成15了，这说明3个进水线程是并行的，其中一个线程进水的同时另外两个线程也在进水，第二行显示容器容量为9；第四行容器容量为12，说明两个排水的线程也在并行执行，只是第二行的线程打印容量时容器容量已经变为9，第四行的线程打印容量时容器容量还是12。</br>
>综合来说，本程序的所有线程都是并行执行的。
***
		进水5立方米，水池容量5
		排水3立方米后容器容量2
		进水5立方米，水池容量7
		排水3立方米后容器容量4
		进水5立方米，水池容量9
如果程序运行结果如上说明线程是并发执行的。</br>
>本程序的线程并不是并发执行的
***
* [并发相关概念的说明](https://blog.csdn.net/hanchao5272/article/details/79513153 "参考链接")
***
* [java并发编程必知必会](https://www.jianshu.com/p/bdac4e8a6839 "参考链接")

***

# 参考资料
[线程池工具类](https://blog.csdn.net/Cecilia620/article/details/77170540 "参考链接")

[Callable接口和Runnable接口](http://uule.iteye.com/blog/1488270 '参考链接')

[java并发队列BlockingQueue](http://www.importnew.com/28053.html "参考链接")

[BlockingQueue深入分析](https://blog.csdn.net/vernonzheng/article/details/8247564 '参考链接')


[BlockingQueue介绍及示例](https://blog.csdn.net/itm_hadf/article/details/7538083 '参考链接')
***
# 调试中遇到的问题的小结
线程池管理工具类是在网上找的。<br>
理解了几个内置函数Calendar类的set() getInstance()，[使用getInstance方法的原因和作用](https://www.cnblogs.com/roadone/p/7977544.html '参考链接')，Timer类的schedule()</br>
本次程序的线程是实现Callable接口（需实现call()方法），有别与之前实现Runnable接口</br>[实现Runnable接口源码](https://github.com/thunderstudying/java/tree/master/Quizs/Thread '实现Runnable接口源码')</br>两种方式的区别在参考资料的第二个链接中解释的很清楚。<br>
之前实现Runnable接口的ThreadSafeDemo2类和ThreadSafeDemo3类在执行过程中展现出来的是线程的并发，而这个程序展现出来的是线程的并行。