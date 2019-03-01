//synchronized block
class Syncronizedblock{
    public void increment(int i) {
           synchronized (this) {
            System.out.println(i++ + Thread.currentThread().getName());
        }
        try {

            Thread.sleep(2000l);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
    class Synchronizedblockcall {
    public static void main(String[] args) {
            Syncronizedblock syncronizedblock = new Syncronizedblock();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 50; i++) {
                        syncronizedblock.increment(i);
                    }
                }

            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 50; i++) {
                        syncronizedblock.increment(i);
                    }
                }
            });
                 t1.start();
                 t2.start();
         }
 }