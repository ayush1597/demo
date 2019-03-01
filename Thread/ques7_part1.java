import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class ScheduleAtFixedRate {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService
                .scheduleAtFixedRate(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000L);
                            System.out.println("ScheduleAtFixedRate "+new Date());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    }, 0, 5, TimeUnit.SECONDS);
    }
}