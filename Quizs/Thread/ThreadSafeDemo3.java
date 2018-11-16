package thread;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ThreadSafeDemo3 implements Runnable {
	private List<String> list;

	public ThreadSafeDemo3(List<String> list) {
		this.list = list;
	}
	public void run() {
		synchronized (list) {
			while (true) {
				if (list.size() <= 0) {//容器容量为0时释放锁，此线程等待notify唤醒
					try {
						list.wait();//释放锁
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				try {
					TimeUnit.MILLISECONDS.sleep(100);// 睡眠100毫秒,便于观察数据
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				list.remove(0);
				System.out.println("移除后容器" + list.size());
				if (list.size() == 1)//唤醒在list监视器上等待的另一个随机线程，使之成为可运行状态，等待获取cpu的使用权
					list.notify();//当此线程释放锁时，被提前唤醒的其它线程获取锁
			}
		}
	}
}
