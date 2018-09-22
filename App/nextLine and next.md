The difference between`next()`and`nextLine()`

    next()会将遇到的空格键、Tab键或Enter键等结束符自动去掉。
    nextLine()返回Enter之前的所有字符
    当nextLine()在nextFloat()、nextDouble()、nextInt()之后使用时会将它们的结束符Enter键当成nextLine()的返回值
    遇到此情况时可以将nextLine()换成next()或者在nextLine()前面加一个nextLine()，将之前输入的结束符过滤掉
[百度经验](http://jingyan.baidu.com/article/9f63fb91ad6cbfc8400f0e82.html "参考链接")

[CSDN](http://blog.csdn.net/major_zhang/article/details/56486540 "参考链接")
