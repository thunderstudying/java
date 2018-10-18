package com.wq;
/**
 * @author wq
 * @date October 18,2018
 */
public abstract class Traffic {
	protected String name;//交通工具名字
	protected double goTime;//到车站(机场)的时间
	protected double backTime;//从车站(机场)返回的时间
	protected double pickTicketTime;//取票时间
	protected double securityCheckTime;//安检时间
	protected double waitTime;//等待时间
	protected double speed;//车速
	protected double moneyPerDistance;//单价
}
