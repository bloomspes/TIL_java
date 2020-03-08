import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
    public static void main(String[] args) throws Exception {
        CallbackThread Callback = new CallbackThread();
        Callback.doWork("10", "10");
        Callback.doWork("5", "oh");
        Callback.finish();


        // execute() 메소드로 작업 처리 요청
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i=0; i<10; i++) {
            Runnable runnable = new Runnable() { // 작업 정의
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();

                    System.out.println("스레드 갯수 : " + poolSize);
                    System.out.println("스레드 이름 : " + threadName);

                    //예외 발생 시킴
                    int ExceptionValue = Integer.parseInt("일영영");
                }

            };
            executorService.execute(runnable);
            Thread.sleep(100);
        }

        executorService.shutdown(); // 스레드풀 종료
    }

} 
