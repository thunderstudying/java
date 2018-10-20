package com.wq;
import java.util.Scanner;
/**
 * @author wq
 * @date October 20,2018
 */
public class Main {
	Student stu;
	Teacher tea;
	Parents par;
	Leader lea;
	ForeignVisiter fv;
	public Main()
	{
		stu=new Student();
		tea=new Teacher();
		par=new Parents();
		lea=new Leader();
		fv=new ForeignVisiter();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入出发地、目的地和接待天数：");
		sc.next();
		sc.next();
		int day=sc.nextInt();
		Main control=new Main();
		control.stu.print(day);
		control.tea.print(day);
		control.par.print(day);
		control.lea.print(day);
		control.fv.print(day);
	}
}
