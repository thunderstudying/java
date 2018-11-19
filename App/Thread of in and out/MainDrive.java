package inandout;

import java.util.Calendar;
import java.util.Timer;
/**
 * @author wq
 * @date 19 Nov,2018
 */
public class MainDrive {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //calendar.clear();
        calendar.set(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE),
                20,0,0//设置当前日历年 月 日 小时 分钟 秒
        );
        WaterTimeTask task = new WaterTimeTask();
        Timer timer = new Timer();
        timer.schedule(task,calendar.getTime(),1000*1000/**60*24*/);//第一个参数为任务 第二个参数任务在此时间（当前时间）开始执行 第三个参数为从开始执行的时间开始每隔的毫秒数
    }
}
