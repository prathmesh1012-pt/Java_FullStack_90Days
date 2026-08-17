import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Collection_ListSetMap {
    
    public static void main(String[] args) {
        List<String> username = new ArrayList<>();
        username.add("Prathmesh");
        username.add("Thorat");
        username.set(1, "prathmesh");
        System.out.print(username);

        Set<String> userSet = new HashSet<>();
        userSet.add("Prathmesh");
        userSet.add("thorat");
        System.err.println(userSet);
        System.err.println(userSet.size());
        userSet.remove("thorat");
        System.err.println(userSet);

        Map<Integer,String> hashusers = new HashMap<>();
        hashusers.put(1, "prathmesh");
        hashusers.put(2, "thorat");
        // System.out.print(hashusers);    
        System.out.println("Map Enteries:");
        for(Map.Entry<Integer, String> entries : hashusers.entrySet()){
            System.out.println("Key :"+ entries.getKey() + "Value :"+ entries.getValue());
        }
        
    }
}
