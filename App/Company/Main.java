package com.wq;
import java.util.Scanner;
/**
 * @author wq
 * @date October 14,2018
 */
public class Main {
	public static void main(String[] args) throws Exception
	{		
		Company c=new Company();
		c.loadData(c);
		int n;
		do 
		{
			Menu.ShowMainMenu();
			System.out.println("请选择:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			switch (n) 
			{
				
			case 1:c.companyStaffSalary(); break;
			case 2:c.companyProfit(); break;
			case 3:c.companyDividend(); break;
			case 4:c.selcetStaff(); break;
			case 5:c.monthlyCompanySalary(); break;
			case 6:break;
			default:System.out.println("ERROR!"); break;
			}
		} 
		while (n != 6);
		}
}
