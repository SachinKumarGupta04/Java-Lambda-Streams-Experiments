import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 30, 50000),
            new Employee("Alice", 25, 60000),
            new Employee("Bob", 35, 45000),
            new Employee("Diana", 28, 55000),
            new Employee("Charlie", 32, 52000)
        );

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by name using lambda expression
        System.out.println("\nSorted by Name:");
        List<Employee> sortedByName = employees.stream()
            .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
            .collect(Collectors.toList());
        sortedByName.forEach(System.out::println);

        // Sort by age using lambda expression
        System.out.println("\nSorted by Age:");
        List<Employee> sortedByAge = employees.stream()
            .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
            .collect(Collectors.toList());
        sortedByAge.forEach(System.out::println);

        // Sort by salary using lambda expression
        System.out.println("\nSorted by Salary:");
        List<Employee> sortedBySalary = employees.stream()
            .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
            .collect(Collectors.toList());
        sortedBySalary.forEach(System.out::println);
    }
}
