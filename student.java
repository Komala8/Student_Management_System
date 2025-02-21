import java.util.*;

// Student class
class Student {
    private int studentId;
    private String name;
    private List<String> enrolledCourses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Enrolled Courses: " + enrolledCourses;
    }
}

