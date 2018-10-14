package com.wq;

public  class Staff {
	protected String name;
	protected double salary=40;//默认员工薪水40
	protected int birthday;//生日的月份
	public Staff(String name)
	{
		this.name=name;
	}
	public Staff()//子类若无明确调用super	编译器自动生成super()，父类必须要有无参构造函数
	{}
}
