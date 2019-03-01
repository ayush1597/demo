import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class ScheduleWitFixedDelay {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(45);
        ListIterator<Integer> listIterator=list.listIterator();
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService
                .scheduleWithFixedDelay(new Runnable() {
                    @Override
                    public void run() {
                        try {
                     for(int i=0;i<list.size();i++) {
                         Thread.sleep(2000L);
                     System.out.println("list"+list.get(i)+"time:"+new Date());
                     }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    },0,5,
                        TimeUnit.SECONDS);
    }
}
