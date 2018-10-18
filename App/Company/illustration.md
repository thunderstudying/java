## 目录
* [运行结果](#运行结果)
* [解释说明](#解释说明)
* [建立数据库](#建立数据库)
* [数据库存放数据](#数据库存放数据)
___
# 运行结果
    *******************公司******************
    * 1  公司全年发放的薪水	*
    * 2  公司的年终利润		*
    * 3  公司的股票分红		*
    * 4  根据姓名查询工资等信息	*
    * 5  查询所有职员某月工资	*
    * 6  退出			*
    ***************************************************
    请选择:
    1
    所有员工的年总薪水2340.0
    所有经理的年总薪水4020.0
    所有股东的年总薪水2040.0


    *******************公司******************
    * 1  公司全年发放的薪水	*
    * 2  公司的年终利润		*
    * 3  公司的股票分红		*
    * 4  根据姓名查询工资等信息	*
    * 5  查询所有职员某月工资	*
    * 6  退出			*
    ***************************************************
    请选择:
    2
    公司营业额:111780
    全年员工薪水:8400
    公司利润:103380


    *******************公司******************
    * 1  公司全年发放的薪水	*
    * 2  公司的年终利润		*
    * 3  公司的股票分红		*
    * 4  根据姓名查询工资等信息	*
    * 5  查询所有职员某月工资	*
    * 6  退出			*
    ***************************************************
    请选择:
    3
    公司分红:10338
    股东名字:股东1	股东薪水40.0	股东股份10	
    股东分红1033.8040096690886
    股东名字:股东2	股东薪水40.0	股东股份20	
    股东分红2067.608019338177
    股东名字:股东3	股东薪水90.0	股东股份15	
    股东分红1550.706014503633


    *******************公司******************
    * 1  公司全年发放的薪水	*
    * 2  公司的年终利润		*
    * 3  公司的股票分红		*
    * 4  根据姓名查询工资等信息	*
    * 5  查询所有职员某月工资	*
    * 6  退出			*
    ***************************************************
    请选择:
    4
    请输入要查询的员工的名字
    股东3
    股东名字:股东3	股东薪水90.0	股东股份15	股东分红1550.706014503633


    *******************公司******************
    * 1  公司全年发放的薪水	*
    * 2  公司的年终利润		*
    * 3  公司的股票分红		*
    * 4  根据姓名查询工资等信息	*
    * 5  查询所有职员某月工资	*
    * 6  退出			*
    ***************************************************
    请选择:
    5
    请输入获取几月的员工薪水
    5
    员工名字:萨斯鬼	员工薪水40.0
    员工名字:员工2	员工薪水70.0
    员工3当月过生日，发放礼物40元
    员工名字:员工3	员工薪水25.0
    员工名字:员工4	员工薪水60.0
    经理名字:经理1	经理薪水40.0	经理奖金50.0
    经理名字:经理2	经理薪水60.0	经理奖金60.0
    经理3当月过生日，发放礼物60元
    经理名字:经理3	经理薪水45.0	经理奖金80.0
    股东名字:股东1	股东薪水40.0	股东股份10
    股东名字:股东2	股东薪水40.0	股东股份20
    股东名字:股东3	股东薪水90.0	股东股份15


    *******************公司******************
    * 1  公司全年发放的薪水	*
    * 2  公司的年终利润		*
    * 3  公司的股票分红		*
    * 4  根据姓名查询工资等信息	*
    * 5  查询所有职员某月工资	*
    * 6  退出			*
    ***************************************************
    请选择:
    6
# 解释说明
* Staff类</br>
公司所有职员的基类
***
* Employee类</br>
公司的员工类，继承Staff类
***
* Manager类</br>
公司的经理类，继承Staff类
***
* StockHolder类</br>
公司的股东类，继承Staff类
***
* Company类</br>
公司类，除构造函数外有6个方法,公司一年发出的薪水；由用户指定查询公司某月发出的薪水；公司的全年利润；公司的年终分红；根据姓名查询职员的工资等信息
***
* ConnectDB类</br>
连接数据库类
***
* Menu类</br>
菜单类
***
* Main类</br>
入口函数类
***
# 建立数据库
      create table Employee
      (
         name varchar(20)not null,
         salary money default 40,
         birthday date not null,	
      )
      create table Manager
      (
         name varchar(20)not null,
         salary money default 40,
         award money default 50,
         birthday date not null
      )
      create table StockHolder
      (
         name varchar(20)not null,
         salary money default 40,
         share int default 10,
         birthday date not null
      )
***
# 数据库存放数据
![image](https://github.com/thunderstudying/java/blob/master/pictures/Employee%E8%A1%A8%E6%95%B0%E6%8D%AE.png "Employee表数据")
![image](https://github.com/thunderstudying/java/blob/master/pictures/Manager%E8%A1%A8%E6%95%B0%E6%8D%AE.png "Manager表数据")
![image](https://github.com/thunderstudying/java/blob/master/pictures/StockHolder%E8%A1%A8%E6%95%B0%E6%8D%AE.png "StockHolder表数据")