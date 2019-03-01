import java.util.concurrent.*;
class future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> Future;
        Future=executorService.submit(new Callable<Integer>() {
           @Override
           public Integer call() throws Exception {
             Thread.sleep(2000l);
               return 25;
           }
       });
        Thread.sleep(1000l);
         executorService.shutdownNow();
        if (Future.isDone()) {
            System.out.println(Future.get());
        }
       else if(Future.isCancelled()){
           System.out.println("cancelled");
        }
    }
}