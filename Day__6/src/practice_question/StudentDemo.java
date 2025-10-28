package practice_question;


import java.io.*;
import java.util.*;

public class StudentDemo {

    public static void main(String[] args) {
        // list of 10 students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sakshi", "Java", 85, 91, "A"));
        students.add(new Student(2, "Rohan", "Python", 55, 70, "C"));
        students.add(new Student(3, "Priya", "C++", 92, 88, "B"));
        students.add(new Student(4, "Aman", "Java", 61, 64, "C"));
        students.add(new Student(5, "Neha", "C#", 75, 95, "A"));
        students.add(new Student(6, "Vikram", "HTML", 45, 58, "D")); 
        students.add(new Student(7, "Karan", "JavaScript", 99, 72, "C"));
        students.add(new Student(8, "Meera", "React", 81, 66, "C"));
        students.add(new Student(9, "Rita", "Angular", 70, 83, "B"));
        students.add(new Student(10, "Tina", "NodeJS", 95, 91, "A"));

        // Calculate grades with attendance check
        for (Student s : students) {
            try {
                s.calculateGrade();
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }

        // Serialize all students to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
            System.out.println("\n 10 Student objects serialized successfully to 'students.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort students by attendance in decreasing order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAttendance(), s1.getAttendance());
            }
        });

        // Display sorted students
        System.out.println("\n Students sorted by attendance :");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

