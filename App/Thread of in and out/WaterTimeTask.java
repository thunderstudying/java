package inandout;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @author wq
 * @date 19 Nov,2018
 */
public class WaterTimeTask extends TimerTask {

    @Override
    public void run() {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);
        InputThread thread1 = new InputThread(queue);
        InputThread thread3 = new InputThread(queue);
        InputThread thread4 = new InputThread(queue);
        OutputThread thread2 = new OutputThread(queue);
        OutputThread thread5 = new OutputThread(queue);
        List<Callable<Object>> threadList = new ArrayList<>(5);//线程容器，容量为5，装载控制进水和出水的线程
        threadList.add(thread1);
        threadList.add(thread2);
        threadList.add(thread3);
        threadList.add(thread4);
        threadList.add(thread5);
        
        List<Object> returnValue = null;
        try {
            returnValue = ThreadUtil.runCheckCallable(threadList,true);/*线程池管理工具传入一组带有返回值的线程，然后由工具类统一管理，并把最终的线程运行集合返回
            Parameters:list 线程集合isBlock 是否阻塞标示位，如果为false，则线程启动后立即返回，否则等待所有线程均有结果后返回（推荐使用true）Returns:线程运行结果集合，仅返回已运行结束的线程集合，如都未结束，则返回尺寸为0的list*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("水池水已经满了");
        System.out.println(returnValue.get(0));
        System.out.println(returnValue.get(1));
        System.out.println(returnValue.get(2));
        System.out.println(returnValue.get(3));
        System.out.println(returnValue.get(4));
    }
}
