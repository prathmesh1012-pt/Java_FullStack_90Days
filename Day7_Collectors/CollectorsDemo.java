import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String department;
    private int salary;
    public Employee(String name, String department, int salary){
           this.name = name;
           this.department = department;
           this.salary = salary; 
    }
    public String getName(){return name;}
    public String getDepartment() {return department;}
    public int  getSalary(){return salary;}

    @Override
    public String toString(){
        return name + " (" + salary + ")";
    }
}
public class CollectorsDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Prathmesh", "IT", 85000),
            new Employee("Amit", "IT", 60000),
            new Employee("Rahul", "HR", 50000),
            new Employee("Sneha", "HR", 55000),
            new Employee("Priya", "Finance", 70000)
        );
        Map<String, List<Employee>> byDept = employees.stream()
                                                .collect(Collectors.groupingBy(Employee::getDepartment));
        // System.out.println(byDept);

        Map<Boolean, List<Employee>> highSalaryPartition = employees.stream()
                                .collect(Collectors.partitioningBy(e -> e.getSalary()>60000));
        // System.out.println("High Salary (True):" + highSalaryPartition.get(true));
        // System.out.println("Low Salary (False):" + highSalaryPartition.get(false));

        String allNames = employees.stream()
        .map(Employee::getName)
        .collect(Collectors.joining("|", "Employee [ ","]"));
        // System.out.println(allNames);

        IntSummaryStatistics salaryStats = employees.stream()
            .collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println("Count: " + salaryStats.getCount());
        System.out.println("Total Sum: " + salaryStats.getSum());
        System.out.println("Average: " + salaryStats.getAverage());
        System.out.println("Max Salary: " + salaryStats.getMax());
    }
}
