//synchronized method
class SynchronizedMethod {
    public static void main(String[] args) {
SynchronizedMethod synchronizedMethod=new SynchronizedMethod();
        Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
        synchronizedMethod.getline();
    }
});
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedMethod.getline();
            }
        });
        t1.start();
 System.out.println("hello"+Thread.currentThread().getName());
        t2.start();
    }

 synchronized public void getline() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i+Thread.currentThread().getName());
            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}