import java.util.Arrays;
import java.util.List;

public class StreamAPIAdvance {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(10, 5, 20, 5, 30, 10, 40, 25);

        // // remove Duplicates
        // numbers.stream()
        //         .distinct()
        //         .sorted()
        //         .forEach(num -> System.out.println(num));
        // int sum = numbers.stream()
        //         .reduce(0, (a,b) -> a+b);
        //         System.out.println(sum);

        List<String> skills = Arrays.asList("Java", "Python", "Java", "Spring Boot", "React", "Python", "Docker");

        skills.stream()
                .distinct()
                .sorted()
                .forEach(str -> System.out.println(str));

    }
}
