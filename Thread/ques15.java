import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class work {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void work1() {
        try {
            lock.lock();
            System.out.println("work 1 started");
            condition.await();
            System.out.println("work 1 finished");
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
    public void work2() {
        try {
            lock.lock();
            System.out.println("work 2 started");
            condition.signal();

            System.out.println("work 2 finished");
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
class Execute{
    public static void main(String[] args) throws InterruptedException {
        work work=new work();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                work.work1();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                work.work2();
            }
        });
        t1.start();
        t2.start();
    t1.join();
    t2.join();
    }
}