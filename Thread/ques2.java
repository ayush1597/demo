public class ques2  {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
            System.out.println("hello from thread 1");
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000l);
                    System.out.println("hello from thread2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
       System.out.println("main thread name:"+Thread.currentThread().getName());
    }
}
