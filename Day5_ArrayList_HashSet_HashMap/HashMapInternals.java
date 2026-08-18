import java.util.HashMap;
import java.util.Objects;

class StudentKey{
    private int id;
    private String name;

    public StudentKey(int id , String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // 2. Overriding equals() to handle key comparison during collisions
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentKey other = (StudentKey) obj;
        return this.id == other.id && Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Student[id=" + id + ", name=" + name + "]";
    }

}
public class HashMapInternals {
public static void main(String[] args) {
    HashMap<StudentKey, String> studentMap = new HashMap<>();

    StudentKey k1 = new StudentKey(101, "prathmesh");
    StudentKey k2 = new StudentKey(101, "prathmesh");

    studentMap.put(k1, "pass");

    // Because hashCode() and equals() are overridden:
    // k2 produces the SAME hash and equals() returns true, so it updates k1's record!
    studentMap.put(k1, "Distinction");

    System.out.println("Map size: " + studentMap.size()); // Prints 1, not 2!
    System.out.println("Result for k2: " + studentMap.get(k2)); // Prints Distinction


}
    
}