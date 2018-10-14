package com.wq;
/**
 * @author wq
 * @date October 14,2018
 */
public class StockHolder extends Staff {
	protected int share=10;//股份
	private static int allShare=100;//所有股东的股份和为100
	private static int shareCount=0;
	public StockHolder(String name)//默认薪水40
	{
		super(name);
		shareCount+=share;
	}
	public StockHolder(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
		shareCount+=share;
	}
	public StockHolder(String name,double salary,int share,int birthday)
	{
		this.name=name;
		this.salary=salary;
		this.share=share;
		this.birthday=birthday;
		shareCount+=share;
	}
	public String toString()//输出股东信息
	{
		StringBuffer s=new StringBuffer("");
		s.append("股东名字:"+name+"\t股东薪水"+salary+"\t股东股份"+share);
		return s.toString();
	}
}
