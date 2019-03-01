//ShutdownNow will terminate the current task even if its not complete
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



    class ShutdownNow {
        public static void main(String[] args) {
            ExecutorService executorService= Executors.newSingleThreadExecutor();
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
                        try {
                            Thread.sleep(4000l);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
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
                        try {
                            Thread.sleep(2000l);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("thread 4");
                    }
                });
            }
            finally {
                executorService.shutdownNow();
            }
        }
    }















