import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 5, 8,3, 19,5, 4, 4, 12,5, 24, 15, 3);
        // 1.Filter Even numbers
        List<Integer> evenNo = numbers.stream()
                                        .filter(num -> num%2 == 0)
                                        .collect(Collectors.toList());
        // System.out.println(evenNo);

        List<String> names = Arrays.asList("prathmesh", "rahul", "amit", "aniket");
        // 2.Convert Name to Uppercase and Sort
        List<String> sortedNames = names.stream()
                                        .map(str -> str.toUpperCase())
                                        .sorted()
                                        .collect(Collectors.toList());
        //  System.out.println(sortedNames);  
        // 3. Find First Name with A
        Optional<String> FirstNameWithA = names.stream()
                                            .filter(str -> str.startsWith("a"))
                                            .findFirst();
        // System.out.print("First Name With A is"+ FirstNameWithA.orElse("Not Found"));
        
        // 4.Sum of list
        int sum = numbers.stream()
                        .reduce(0,(a,b)-> a+b);
        // System.out.println(sum);

        // 5.Count Elements Which is greater than 500
        List<Integer> prices = Arrays.asList(150, 800, 1200, 450, 2000, 90);

        long countEx =  prices.stream()
                                    .filter(num -> num>500)
                                    .count();
        // System.out.print(countEx);

        // 6 Remove Duplicates
        List<Integer> sortednumbers = numbers.stream()
                                            .distinct()
                                            .sorted()
                                            .collect(Collectors.toList());
                                        
        // System.out.println(sortednumbers);

        // 7 Join string with delimiter
        List<String> skills = Arrays.asList("Java", "Spring Boot", "SQL", "React");
         String skillsWithDelimiter = skills.stream()
                                                .collect(Collectors.joining(",")) ;
        // System.out.println(skillsWithDelimiter);
        // Problem 8: Find Maximum Value
      
        
        Optional<Integer> maxVal = numbers.stream()
                                         .max(Integer::compare);
        System.out.println("8. Max Value: " + maxVal.orElse(-1));

                                    
    }
}
