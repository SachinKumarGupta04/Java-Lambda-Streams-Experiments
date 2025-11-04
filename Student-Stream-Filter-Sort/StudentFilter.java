import java.util.*;
import java.util.stream.*;

class Student {
    private String name;
    private double marks;
    private double percentage;

    public Student(String name, double marks, double totalMarks) {
        this.name = name;
        this.marks = marks;
        this.percentage = (marks / totalMarks) * 100;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + ", percentage=" + String.format("%.2f", percentage) + "%}";
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Rahul", 480, 600),
            new Student("Priya", 510, 600),
            new Student("Amit", 420, 600),
            new Student("Sneha", 540, 600),
            new Student("Vikram", 390, 600),
            new Student("Anjali", 465, 600),
            new Student("Rohan", 495, 600),
            new Student("Kavya", 555, 600)
        );

        System.out.println("All Students:");
        students.forEach(System.out::println);

        // Filter students scoring above 75% and sort by marks
        System.out.println("\nStudents scoring above 75% (sorted by marks):");
        List<Student> filteredStudents = students.stream()
            .filter(student -> student.getPercentage() > 75)
            .sorted((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()))
            .collect(Collectors.toList());
        
        // Display names of filtered students
        System.out.println("\nNames of students scoring above 75%:");
        filteredStudents.stream()
            .map(Student::getName)
            .forEach(System.out::println);

        // Display complete details
        System.out.println("\nComplete details:");
        filteredStudents.forEach(System.out::println);

        // Calculate average marks of students above 75%
        double averageMarks = filteredStudents.stream()
            .mapToDouble(Student::getMarks)
            .average()
            .orElse(0.0);
        
        System.out.println("\nAverage marks of students above 75%: " + String.format("%.2f", averageMarks));
    }
}
