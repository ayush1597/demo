//implementing runnable interface
public class ques1 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running");
    }

       public static void main(String[] args) {
        Thread t1 = new Thread(new ques1());
        t1.start();
    }
}