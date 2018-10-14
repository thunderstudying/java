package com.wq;
/**
 * @author wq
 * @date October 14,2018
 */
public class Employee extends Staff  {
	public Employee(String name)//默认薪水40
	{
		super(name);
	}
	public Employee(String name,double salary,int birthday)
	{
		this.name=name;
		this.salary=salary;
		this.birthday=birthday;
	}
	public String toString()//输出员工信息
	{
		StringBuffer s=new StringBuffer("");
		s.append("员工名字:"+name+"\t员工薪水"+salary);
		return s.toString();
	}
}
