package com.wq;
import java.sql.*;
public class ConnectDB {
	public Connection con=null;//声明Connection对象的实例
	public Statement stmt=null;//声明Statement对象的实例
	public ResultSet rs=null;//声明ResultSet对象的实例
	private static String url=null;//连接数据库的URL地址
	private static String driver=null;//数据库驱动
	private static final String username="sa";//数据库的用户名
	private static final String password="018410";//数据库的密码
	public ConnectDB()
	{
		url="jdbc:sqlserver://localhost;Database=Company";
		driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	}
	public static Connection getConnection()throws Exception//获取数据库连接
	{
		Connection con=null;
		try 
		{//连接数据库时可能发生异常因此需要捕捉这个异常
			Class.forName(driver).newInstance();//装载数据库驱动
			con=DriverManager.getConnection(url, username, password); 
		}
		catch(Exception ee)
		{
			ee.printStackTrace();//输出异常信息
		}
		if(con==null)
		 {
			System.err
			.println("警告:DbConnectionManager.getConnection()获得数据库链接失败.\r\n\r\n链接类型:"
			+ driver + "\r\n链接位置:" + url); // 在控制台上输出提示信息
		}
		return con;//返回数据库连接对象
	}
	
	public ResultSet executeQuery(String sql)throws Exception//数据库执行查询语句
	{
		try//捕捉异常
		{
		con=getConnection();//调用getConnection()方法构造Connection对象的一个实例con
		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs=stmt.executeQuery(sql);
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());// 输出异常信息
		}
		return rs;// 返回结果集对象
	}
	public int executeUpdate(String sql)throws Exception//数据库更新操作
	{
		int result=0;//定义保存返回值的变量
		try // 捕捉异常
		{
			con=getConnection();// 调用getConnection()方法构造Connection对象的一个实例conn
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			result=stmt.executeUpdate(sql);// 执行更新操作
		}
		catch(SQLException ex)
		{
			result=0;// 将保存返回值的变量赋值为0
		}
		return result;// 返回保存返回值的变量
	}
	public void close()//关闭数据库连接
	{
		try  // 捕捉异常
		{
			if(rs!=null)//当ResultSet对象的实例rs不为空时
			{
				rs.close();// 关闭ResultSet对象
			}
			if(stmt!=null)// 当Statement对象的实例stmt不为空时
			{
				stmt.close();// 关闭Statement对象
			}
			if(con!=null)// 当Connection对象的实例conn不为空时
			{
				con.close();// 关闭Connection对象
			}
		}
		catch(Exception e)
		{
			e.printStackTrace(System.err);// 输出异常信息
		}
	}
}
