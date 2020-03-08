import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackThread {

    private ExecutorService executorService;

    public CallbackThread() {
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    private CompletionHandler<Integer, Void> callback =
            new CompletionHandler<Integer, Void>() {
                @Override
                public void completed(Integer result, Void attachment) {
                    System.out.println(result);
                }

                @Override
                public void failed(Throwable exc, Void attachment) {
                    System.out.println(exc.toString());

                }
            };

    public  void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int X = Integer.parseInt(x);
                    int Y = Integer.parseInt(y);
                    int result = X + Y;

                    callback.completed(result, null);
                }
                catch (NumberFormatException e) {
                    callback.failed(e, null);
                }
            }
        };
        executorService.submit(task);
    }

    public void finish() {
        executorService.shutdown();
    }

} 
