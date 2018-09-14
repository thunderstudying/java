![image](https://github.com/thunderstudying/java/blob/master/type%20of%20data%20in%20java.png)
基本数据类型数据变量在声明之后java就会立刻分配给他内存空间
引用数据类型变量以特殊的方式指向对象实体（具体的值），这类变量声明时不会分配内存，只是存储了一个内存地址
以下来自https://zhidao.baidu.com/question/309137317.html
"=="可用于基本类型和引用类型：当用于基本类型时候，是比较值是否相同；当用于引用类型的时候，是比较对象是否相同。
1.“==”作用在引用数据类型间,判断内存地址是否相等,想判断内容实体用equals;
2.基本传值传参传的是副本,修改后原值不变;引用传值传参传的是地址,修改后原值改变.
![image](https://github.com/thunderstudying/java/blob/master/compare%20two%20type%20of%20java.png)

Java中的hashCode方法就是根据一定的规则将与对象相关的信息（比如对象的存储地址,对象的字段等）映射成一个数值,这个数值称作为散列值.

[Ljava.lang.String;@f0c85e是一种对函数返回值和参数的编码。这种编码叫做JNI字段描述符（JavaNative Interface FieldDescriptors).
[Ljava.lang.String;@f0c85e
"[" 表示一维数组 
"[["表示二维数组 
"L"表示一个对象 
"java.lang.String"表示对象的类型 
"@"后面表示该对象的HashCode
