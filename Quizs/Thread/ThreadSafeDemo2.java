package thread;

import java.util.List;
import java.util.concurrent.TimeUnit;
/**
 * @author wq
 * @date 16 Nov,2018
 */
public class ThreadSafeDemo2 implements Runnable {
	private List<String> list;

	public ThreadSafeDemo2(List<String> list) {
		this.list = list;
	}
	public void run() {
		synchronized (list) {//获取锁时执行while
			while (true) {
				if (list.size() > 6) {//容器容量为7时释放锁，此线程等待notify唤醒
					try {
						list.wait();//释放锁
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					TimeUnit.MILLISECONDS.sleep(100);// 睡眠100毫秒,便于观察数据
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				list.add("无用数据");
				System.out.println("加入元素后list容量" + list.size());
				if (list.size() == 5)//唤醒在list监视器上等待的另一个随机线程，使之成为可运行状态，等待获取cpu的使用权
					list.notify();//当此线程释放锁时，被提前唤醒的其它线程获取锁
			}
		}
	}
}
