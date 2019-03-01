import java.util.concurrent.atomic.AtomicInteger;

class Atomicvalue {
AtomicInteger intvalue=new AtomicInteger(0);
public void increment(){
    intvalue.incrementAndGet();
}
public int value(){
    return intvalue.get();
 }
}
class Atomic {
    public static void main(String[] args) {
        Atomicvalue av = new Atomicvalue();
        for (int i = 0; i <250; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                av.increment();
                }
            }).start();

        }
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("value:" + av.value());
    }
}