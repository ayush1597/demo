//Use a singleThreadExecutor to submit multiple threads.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ques3 {
    public static void main(String[] args) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 1");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 2");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 3");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 4");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 5");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 4");
                }
            });
        }
        finally {
            executorService.shutdown();
        }
    }
}
