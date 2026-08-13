import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 15, 3, 30);

        // List<Integer> isGretherThan15 = numbers.stream()
        // .filter(num -> num>15)
        // .collect(Collectors.toList());
        // System.out.println(isGretherThan15);

        
        // List<Integer> doulbledNumbers = numbers.stream()
        // .map(num -> num * num)
        // .collect(Collectors.toList());
        // System.out.println(doulbledNumbers);

        // List<Integer> squaredNumber = numbers.stream()
        // .filter(num -> num % 2 == 0)
        // .map(num -> num * num)
        // .collect(Collectors.toList());
        // System.out.println(squaredNumber);

        List<String> services = Arrays.asList("Auth Service", "DB Service", "User Service", "Payment Gateway");

        List<String> newServices = services.stream()
        .filter(str -> str.contains("Service"))
        .map(str -> str.toUpperCase())
        .collect(Collectors.toList());

        System.out.print(newServices);

    }
}
