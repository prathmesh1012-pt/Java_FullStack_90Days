import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ConcurrentHashMap;
public class ThreadPoolDmo {

    public static void main(String[] args) {
        
    Map<String, String> activeSessions = new ConcurrentHashMap<>();

    ExecutorService threadPool = Executors.newFixedThreadPool(3);

    for(int i = 1 ; i<=5; i++){
        final int userId = i;
        threadPool.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Processing User-" + userId + " on " + threadName);
                
            // Thread-safe update to Map
            activeSessions.put("User-" + userId, "TOKEN_XYZ_" + userId);
            
        });
    }
        threadPool.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("\nActive Sessions in ConcurrentHashMap:");
        System.out.println(activeSessions);
    }
}
