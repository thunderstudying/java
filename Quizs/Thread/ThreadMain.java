package thread;

import java.util.ArrayList;
import java.util.List;
/**
 * @author wq
 * @date 16 Nov,2018
 */
public class ThreadMain {
	public static void main(String[] arg)
	{
		List<String> list=new ArrayList<>();
		/*for(int cnt=0;cnt<10;cnt++)
		{
			list.add("abc");
		}
		ThreadSafeDemo1 demo1=new ThreadSafeDemo1(list);//①对其它的synchronized同步方法或synchronized(this)同步代码块调用是堵塞状态；
														//②同一时间只有一个线程执行synchronized同步方法中的代码。
		ThreadSafeDemo1 demo2=new ThreadSafeDemo1(list);
		new Thread(demo1).start();
		new Thread(demo2).start();*/
		ThreadSafeDemo2 demo1=new ThreadSafeDemo2(list);		
		ThreadSafeDemo3 demo10=new ThreadSafeDemo3(list);
		new Thread(demo1).start();
		//new Thread(demo10).start();//线程的一种启动方法，此方法无法执行线程的其它操作，没有线程对象名
		Thread thread=new Thread(demo10);//此方法创建的线程可以执行其它任何操作
		thread.start();
	}
}
