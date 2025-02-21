import java.util.*;

    // Student Management System
public class StudentManagementSystem {
    private Map<Integer, Student> students = new HashMap<>();
    
    public synchronized void addStudent(Student student) {
        students.put(student.getStudentId(), student);
        System.out.println("Student added: " + student);
    }
    
    public synchronized void removeStudent(int studentId) {
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            System.out.println("Student removed: ID " + studentId);
        } else {
            System.out.println("Student not found.");
        }
    }
    
    public synchronized void showStudents() {
        System.out.println("\nRegistered Students:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
    
    public synchronized void enrollStudentInCourse(int studentId, String course) {
        if (!students.containsKey(studentId)) {
            System.out.println("Invalid Student ID.");
            return;
        }
        students.get(studentId).enrollCourse(course);
        System.out.println("Student " + studentId + " enrolled in " + course);
    }
}



