package com.wq;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * @author wq
 * @date October 14,2018
 */
public class Company {
	private double profit;//利润
	private double turnover;//营业额
	private double allStaffSalary;//全年员工薪水
	private double staffSalary;//每月员工薪水
	private double dividend;//分红
	private double stockDividend;//每个股东的股票分红
	public static List<Employee> employee;//存放Employee类对象的List
	public static List<Manager> manager;//存放Manager类对象的List
	public static List<StockHolder> stockholder;//存放StockHolder类对象的List
	public static Map<String,Staff> map;//存放所有职员信息的Map
	public Company()
	{
		turnover=(double)(Math.random()*100000+100000);//营业额范围[100000-200000)
		staffSalary=0;
		employee=new ArrayList<>();
		manager=new ArrayList<>();
		stockholder=new ArrayList<>();
		map=new HashMap<String, Staff>();
	}
	public void companyStaffSalary()//公司一年发出的薪水
	{
		Iterator<Employee> e=employee.iterator();
		staffSalary=0;
		while(e.hasNext())
		{
			staffSalary+=e.next().salary;//累计所有员工的月薪水
		}
		staffSalary*=12;//所有员工的年薪水
		allStaffSalary=staffSalary;//用于累加所有职员的薪水和奖金的
		System.out.println("所有员工的年总薪水"+staffSalary);
		Iterator<Manager> m=manager.iterator();
		staffSalary=0;
		while(m.hasNext())
		{
			staffSalary+=m.next().totalWages;//累计所有经理的月薪水与奖金
		}
		staffSalary*=12;//所有经理的年薪水和奖金
		allStaffSalary+=staffSalary;//用于累加所有职员的薪水和奖金的
		System.out.println("所有经理的年总薪水"+staffSalary);
		Iterator<StockHolder> s=stockholder.iterator();
		staffSalary=0;
		while(s.hasNext())
		{			
			staffSalary+=s.next().salary;//累计所有股东的月薪水
		}
		staffSalary*=12;//所有股东的年薪水
		allStaffSalary+=staffSalary;//用于累加所有职员的薪水和奖金的
		System.out.println("所有股东的年总薪水"+staffSalary);
	}
	public void monthlyCompanySalary()//公司某月发出的薪水
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入获取几月的员工薪水");
		int month=sc.nextInt();
		Iterator<Employee> e=employee.iterator();
		while(e.hasNext())
		{
			int gift=40;//当月过生日发放礼物40元
			Employee employee=e.next();
			if(employee.birthday==month)
			{
				System.out.println(employee.name+"当月过生日，发放礼物"+gift+"元");
			}
			System.out.println(employee.toString());
		}
		//System.out.println("所有员工"+month+"月的总薪水"+staffSalary);
		Iterator<Manager> m=manager.iterator();
		while(m.hasNext())
		{
			int gift=60;
			Manager manager=m.next();
			if(manager.birthday==month)
			{
				System.out.println(manager.name+"当月过生日，发放礼物"+gift+"元");
			}
			System.out.println(manager.toString());
		}
		Iterator<StockHolder> s=stockholder.iterator();
		while(s.hasNext())
		{	
			StockHolder stockholder=s.next();
			System.out.println(stockholder.toString());
		}		
	}
	public double companyProfit() //公司的全年利润
	{
		profit=turnover-allStaffSalary;
		System.out.println("公司营业额:"+(int)turnover);
		System.out.println("全年员工薪水:"+(int)allStaffSalary);
		System.out.println("公司利润:"+(int)profit);
		return profit;
	}
	public double companyDividend()//公司的年终分红
	{
		dividend=profit*(0.1);//公司利润的10%用于分红
		System.out.println("公司分红:"+(int)dividend);
		Iterator<StockHolder> s=stockholder.iterator();
		while(s.hasNext())
		{
			StockHolder temp;//临时变量，记录迭代器中股东的属性
			temp=s.next();
			stockDividend=temp.share*dividend*0.01;//按百分比分红要乘以0.01
			System.out.println(temp.toString()+"\t\r股东分红"+stockDividend);
		}
		return dividend;
	}
	public void selcetStaff()//根据姓名查询工资等信息
	{
		System.out.println("请输入要查询的员工的名字");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Staff temp=new Staff();
		temp=Company.map.get(name);
		//instanceof关键字 判断左边的对象是否是右边的类的实例 返回boolean的数据类型
		if(temp instanceof Employee)//判断查询的是否为员工
		{
			Employee e=new Employee("");
			e=(Employee) Company.map.get(name);//临时对象，记录迭代器中员工的属性
			System.out.println(e.toString());//输出员工的属性
		}
		if(temp instanceof Manager)//判断查询的是否为经理
		{
			Manager m=new Manager("");
			m=(Manager) Company.map.get(name);//临时对象，记录迭代器中经理的属性
			System.out.println(m.toString());//输出经理的属性
		}
		if(temp instanceof StockHolder)//判断查询的是否为股东
		{
			StockHolder s=new StockHolder("");
			s=(StockHolder) Company.map.get(name);//临时对象，记录迭代器中股东的属性
			System.out.println(s.toString()+"\t股东分红"+s.share*dividend*0.01);//输出股东的属性
		}
	}
	public void loadData(Company c) throws Exception
	{
		ConnectDB connectdb=new ConnectDB();
		String str=new String("select name,salary,month(birthday) as birthday from Employee");//获取Employee表的所有元组信息
		ResultSet rs=connectdb.executeQuery(str);
		c=new Company();
		while(rs.next())
		{
			String name=rs.getString("name");
			double salary=rs.getDouble("salary");
			int date=rs.getInt("birthday");
			Employee e=new Employee(name,salary,date);//将数据库中的employee信息赋值给Employee对象
			Company.employee.add(e);//将Employee类的对象e放入ArrayList类型的employee
			Company.map.put(name, e);//将Employee类的对象的名字属性和Employee对象放入Hashmap类型的map
		}
		str=new String("select name,salary,award,month(birthday) as birthday from Manager");//获取Manager表的所有元组信息
		rs=connectdb.executeQuery(str);
		while(rs.next())
		{
			String name=rs.getString("name");
			double salary=rs.getDouble("salary");
			double award=rs.getDouble("award");
			int date=rs.getInt("birthday");
			Manager m=new Manager(name,salary,award,date);//将数据库中的manager信息赋值给Manager对象
			Company.manager.add(m);//将Manager类的对象m放入ArrayList类型的manager
			Company.map.put(name, m);//将Manager类的对象的名字属性和Manager对象放入Hashmap类型的map
		}
		str=new String("select name,salary,share,month(birthday) as birthday from StockHolder");//获取StockHolder表的所有元组信息
		rs=connectdb.executeQuery(str);
		while(rs.next())
		{
			String name=rs.getString("name");
			double salary=rs.getDouble("salary");;
			int share=rs.getInt("share");
			int date=rs.getInt("birthday");
			StockHolder s=new StockHolder(name,salary,share,date);//将数据库中的stockholder信息赋值给StockHolder对象
			Company.stockholder.add(s);//将StockHolder类的对象s放入ArrayList类型的stockholder
			Company.map.put(name, s);//将StockHolder类的对象的名字属性和StockHolder对象放入Hashmap类型的map
		}
	}
}
