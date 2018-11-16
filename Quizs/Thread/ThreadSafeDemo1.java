package thread;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 * @author wq
 * @date 16 Nov,2018
public class ThreadSafeDemo1 implements Runnable {
	private List<String> list;
	public ThreadSafeDemo1(List<String> list)
	{
		this.list=list;
	}
	public  void run()
	{
		Random random=new Random();
		System.out.println("输出随机数"+random.nextInt());//产生所有整数范围内的耨一个整数
		synchronized(list)
		{
			Iterator<String> iterator =list.iterator();
			int cnt=0;
			while(iterator.hasNext())
			{
				iterator.next();
				iterator.remove();
				cnt++;
				try
				{
					TimeUnit.MILLISECONDS.sleep(10);//睡眠10毫秒
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("循环次数"+cnt);
		}
	}
}
