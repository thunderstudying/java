## 目录
* [运行结果](#运行结果)
* [解释说明](#解释说明)
* [总结](#总结)
___
# 运行结果
    请输入出发地、目的地和距离(公里):
    武汉 上海 834
    Bus消耗时间:10.52小时
    Bus价格:266.88元
    HighSpeedTrain消耗时间:5.66小时
    HighSpeedTrain价格:375.3元
    Plane消耗时间:1.49小时
    Plane价格:625.5元
# 解释说明
* Traffic类</br>
抽象类，有各种属性包括交通工具名字、到车站(机场)的时间、从车站(机场)返回的时间、取票时间、安检时间、等待时间、车速、单价
***
* count类</br>
接口，有方法countTimePrice和print
***
* Bus类</br>
继承抽象类和实现接口
***
* HighSpeedTrain类</br>
同上
* Train类</br>
同上
***
* Main类</br>
控制类
***
# 总结
    此次编程主要是为了学习接口与抽象类的异同
    抽象类体现了数据抽象的思想，是实现多态的一种机制。它定义了一组抽象的方法，至于这组抽象方法的具体表现形式有派生类来实现
    接口是用来建立类与类之间的协议，它所提供的只是一种形式，而没有具体的实现。同时实现该接口的实现类必须要实现该接口的所有方法，通过使用implements关键字，他表示该类在遵循某个或某组特定的接口，同时也表示着“interface只是它的外貌，但是现在需要声明它是如何工作的”
    Java 为了保证数据安全性是不能多继承的，也就是一个类只有一个父类。
    但是接口不同，一个类可以同时实现多个接口，不管这些接口之间有没有关系，所以接口弥补了抽象类不能多继承的缺陷。
[菜鸟教程](http://www.runoob.com/java/java-interfaces.html "参考链接")</br>
[CSDN](https://blog.csdn.net/chenssy/article/details/12858267 "参考链接")</br>
[CSDN](https://blog.csdn.net/u011240877/article/details/78420277#%E4%BB%80%E4%B9%88%E6%98%AF%E6%8A%BD%E8%B1%A1%E7%B1%BB%E5%92%8C%E6%8E%A5%E5%8F%A3 "参考链接")
![image](https://github.com/thunderstudying/java/blob/master/pictures/abstract%20interface.png)
