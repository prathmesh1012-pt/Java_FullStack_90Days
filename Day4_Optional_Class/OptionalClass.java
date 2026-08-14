import java.util.Optional;
public class OptionalClass {
    public static void main(String[] args) {
        String userEmail = null;
        // optional creation using ofNullable() 
        Optional<String> optionalEmail = Optional.ofNullable(userEmail);
        // System.out.println(optionalEmail);
        
        // It Return NPE
        // Optional<String> optionalEmail1 = Optional.of(userEmail);
        // System.out.println(optionalEmail1);
        
        // it create empty optional
        // Optional<String> optionalEmail2 = Optional.empty();
        // System.out.println(optionalEmail2);

    
        // Fallback using orElse() to prevent NPE
        String finalEmail = optionalEmail.orElse("xyz@email.com");
        System.out.println(finalEmail);

        Optional<String> activeUser = Optional.of("prathmesh");

        activeUser.ifPresent(name -> System.out.println(name));

        System.out.println(activeUser.orElse("n"));
        
        System.out.println(optionalEmail.orElse("n"));
    }
}   
