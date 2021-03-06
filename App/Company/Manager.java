package com.wq;
/**
 * @author wq
 * @date October 14,2018
 */
public class Manager extends Staff{
	protected double award=50;//经理奖金默认50
	protected double totalWages;//经理的总工资，奖金加薪水
	public Manager(String name)//默认薪水40
	{
		super(name);
		totalWages=salary+award;
	}
	public Manager(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
		totalWages=salary+award;
	}
	public Manager(String name,double salary,double award,int birthday)
	{
		this.name=name;
		this.salary=salary;
		this.award=award;
		this.birthday=birthday;
		totalWages=salary+award;
	}
	public String toString()//输出经理信息
	{
		StringBuffer s=new StringBuffer("");
		s.append("经理名字:"+name+"\t经理薪水"+salary+"\t经理奖金"+award);
		return s.toString();
	}
}
