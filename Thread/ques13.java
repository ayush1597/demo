class WaitAndNotifyALL  {
    public void work1()  {
        synchronized (this) {
            System.out.println("work 1 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("work 1 ended");
    }
    public void work2()  {
        synchronized (this) {
            System.out.println("work 2 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("work 2 ended");
    }
    public void work3() {
        synchronized (this) {
            System.out.println("work 3 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("work 3 ended");
    }
    public void work4() {
        synchronized (this) {
            System.out.println("work 4 started");
            notifyAll();
        }
        System.out.println("work 4 ended");
    }
}
class NotifyAll{
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotifyALL waitAndNotifyALL=new WaitAndNotifyALL();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyALL.work1();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyALL.work2();
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyALL.work3();
            }
        });
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyALL.work4();
            }
        });

        t1.start();
        t2.start();
         t3.start();
         t4.start();
    }
}