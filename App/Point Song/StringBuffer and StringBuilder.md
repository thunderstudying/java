`StringBuilder`和`StringBuffer`
    
    当对字符串进行修改时要用到`StringBuilder`和`StringBuffer`
    StringBuilder和StringBuffer类的对象可以被多次修改，并且不产生新的未使用对象
    StringBuffer是线程安全的(可以同步访问)
    StringBuilder不是线程安全的
    StringBuilder比StringBuffer有速度优势，当应用程序要求进程安全时，应使用StringBuffer
    线程安全举例:不允许一个银行账户被两个取款机同时取款
[菜鸟教程](http://www.runoob.com/java/java-stringbuffer.html "参考链接")
