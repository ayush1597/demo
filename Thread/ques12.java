 class WaitAndNotify {
     public void work1() throws InterruptedException {
         synchronized (this) {
             System.out.println("work 1 started");
             wait();
         }
         System.out.println("work 1 ended");
     }
        

     public void work2() throws InterruptedException {
         synchronized (this) {
             System.out.println("work 2 started");
             notify();
         }
     System.out.println("work 2 ended"); 
     }
     
 }
    class Wordclass{
        public static void main(String[] args) throws InterruptedException {
WaitAndNotify waitAndNotify=new WaitAndNotify();
Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            waitAndNotify.work1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        waitAndNotify.work2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

t1.start();
t2.start();
        }
     }







