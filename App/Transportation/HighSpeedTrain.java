package com.wq;
import java.text.DecimalFormat;
/**
 * @author wq
 * @date October 18,2018
 */
public class HighSpeedTrain extends Traffic implements count {
	private String name;//交通工具名字
	private double goTime;//到车站的时间
	private double backTime;//从车站返回的时间
	private double pickTicketTime;//取票时间
	private double securityCheckTime;//安检时间
	private double waitTime;//等待时间
	private double speed;//车速
	private double moneyPerDistance;//单价
	public HighSpeedTrain()
	{
		name="HighSpeedTrain";
		goTime=100;
		backTime=100;
		pickTicketTime=50;
		securityCheckTime=50;
		waitTime=50;
		speed=150;//车速150公里/小时
		moneyPerDistance=0.45;
	}
	@Override
	public void countTimePrice(double distance) {
		// TODO Auto-generated method stub
		double  totalTime;
		totalTime=(goTime+backTime+pickTicketTime+securityCheckTime+waitTime)/3600+distance/speed;//输出时间单位为小时
		DecimalFormat f=new DecimalFormat(".00");//保留两位小数
		System.out.println(name+"消耗时间:"+f.format(totalTime)+"小时");
		System.out.println(name+"价格:"+distance*moneyPerDistance+"元");
	}

	@Override
	public void print(Double distance) {
		// TODO Auto-generated method stub		
		countTimePrice(distance);
	}
}
