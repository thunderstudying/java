package com.wq;
/**
 * @author wq
 * @date October 20,2018
 */
public class ForeignVisiter implements Reception  {
	int eat;
	int live;
	int travel;
	int gift;
	public ForeignVisiter()
	{
		eat=45;
		live=50;
		travel=55;
		gift=200;
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
	public void gift()
	{
		System.out.println("送礼物花费"+gift+"元");
	}
	public void print(int day)
	{
		System.out.println("老师费用明细和总和");
		eat(day);
		live(day);
		travel(day);
		gift();
		System.out.println("总共花费"+((eat+live+travel)*day+gift)+"元"+"\n");
	}	
}
