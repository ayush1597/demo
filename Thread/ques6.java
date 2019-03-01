import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ques6 {
    public static void main(String[] args) throws InterruptedException {
List<Callable<String>> list=new ArrayList();
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        list.add(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "1st added";
            }
        });
        list.add(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "2nd added";
            }
        });

        list.add(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "3rd added";
            }
        });
        list.add(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "4th added";
            }
        });
    List<Future<String>> futurelist=executorService.invokeAll(list);
    //wait untill all tasks are completed
    for(Future<String> future:futurelist ){
        if(future.isDone()){
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }


    }
}

