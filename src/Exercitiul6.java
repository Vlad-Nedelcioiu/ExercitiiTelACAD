//ExecutorService
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercitiul6 {
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();
        Runnable task = () -> {
            for(int i = 0; i<500000 ; i++){
                atomicInteger.incrementAndGet();
                //System.out.println(atomicInteger);
            }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(task);
        service.shutdown();

        try {

            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            service.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println(atomicInteger.get());


    }
}