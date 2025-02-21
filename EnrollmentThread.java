
// Thread class for parallel enrollment
class EnrollmentThread extends Thread {
    private StudentManagementSystem system;
    private int studentId;
    private String course;
    
    public EnrollmentThread(StudentManagementSystem system, int studentId, String course) {
        this.system = system;
        this.studentId = studentId;
        this.course = course;
    }
    
    @Override
    public void run() {
        system.enrollStudentInCourse(studentId, course);
    }
}