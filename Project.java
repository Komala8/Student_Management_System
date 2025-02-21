import java.util.*;



public class Project {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Sample Students
        system.addStudent(new Student(1, "Alice"));
        system.addStudent(new Student(2, "Bob"));
        system.addStudent(new Student(3, "Charlie"));
        system.addStudent(new Student(4, "David"));

        int choice;
        do {
            System.out.println("\nStudent Management Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Show Students");
            System.out.println("4. Enroll in Course");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    system.addStudent(new Student(studentId, name));
                    break;
                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = scanner.nextInt();
                    system.removeStudent(removeId);
                    break;
                case 3:
                    system.showStudents();
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    int enrollId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course Name: ");
                    String course = scanner.nextLine();
                    new EnrollmentThread(system, enrollId, course).start();
                    break;
                case 5:
                    System.out.println("Exiting Student Management System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
} 