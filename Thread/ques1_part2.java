//thread by extending class
 class ThreadDemo extends Thread{
@Override
public void run(){
    System.out.println("thread is running");

}
    public static void main(String[] args) {
Thread t1=new ThreadDemo();
t1.start();

    }
}
