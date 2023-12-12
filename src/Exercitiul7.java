import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exercitiul7 {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println(LocalTime.now());
        };

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        service.scheduleAtFixedRate(task,2,5, TimeUnit.SECONDS);
    }
}