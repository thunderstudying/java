package inandout;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author wq
 * @date 19 Nov,2018
 */
public class InputThread implements Callable<Object>{

    private BlockingQueue<String> queue;

    public InputThread(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public Object call() throws InterruptedException {
        while(true){
            boolean flag = true;
            int count=0;//0则表示进水5,1则表示进水少于5或者已经满
            for(int cnt=0;cnt<5;cnt++){//1秒进水5立方米
                flag = queue.offer("进水1立方米");
                count++;
                if(!flag){//如果不能容纳1立方米返回false
                    count--;
                	break;
                }
            }
            	System.out.println("进水"+count+"立方米，水池容量"+queue.size());
            if(!flag){
                break;
            }
            TimeUnit.SECONDS.sleep(1);//休息1秒
        }
        return "进水线程success并终止";
    }
}
