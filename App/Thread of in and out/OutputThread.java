package inandout;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author wq
 * @date 19 Nov,2018
 */
public class OutputThread implements Callable<Object>{

    private BlockingQueue<String> queue;

    public OutputThread(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public Object call() throws InterruptedException {//callable接口必须实现call方法，call方法可以返回任何对象。 类似于runable接口必须实现run方法
        while(true){
            if(queue.size()>=100){//容量达到10000立方米不排水
                break;
            }
            for(int cnt=0;cnt<3;cnt++){//1秒排水3立方米
                queue.poll(1,TimeUnit.SECONDS);//执行移除操作。若阻塞则等待此操作，直到成功或者超过指定时间(1秒)
            }
            System.out.println("排水3立方米后容器容量"+queue.size());
            TimeUnit.SECONDS.sleep(1);//睡眠1秒
        }
        return "排水进程success并终止";
    } 
}
