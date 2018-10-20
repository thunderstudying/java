package com.wq;
/**
 * @author wq
 * @date October 20,2018
 */
public class Teacher implements Reception  {
	int eat;
	int live;
	int travel;
	public Teacher()
	{
		eat=25;
		live=30;
		travel=35;
	}
	public void eat(int day) 
	{
		System.out.println("报销吃饭"+eat+"元"+"*"+day+"天"+"="+eat*day+"元");
	}
	public void live(int day)
	{
		System.out.println("报销住宿"+live+"元"+"*"+day+"天"+"="+live*day+"元");
	}
	public void travel(int day)
	{
		System.out.println("报销行程"+travel+"元"+"*"+day+"天"+"="+travel*day+"元");
	}
	public void print(int day)
	{
		System.out.println("老师费用明细和总和");
		eat(day);
		live(day);
		travel(day);
		System.out.println("总共花费"+(eat+live+travel)*day+"元"+"\n");
	}	
}
