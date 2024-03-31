import java.util.ArrayList;
import java.util.List;

// Interface class for loose coupling
interface EnrollmentSystem {
    void enrollStudent(student student, Course course);

    void dropStudent(student student, Course course);

    void displayEnrollmentDetails();
}

// Student class with high cohesion
class student {
    private String studentId;
    private String studentName;

    public student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class with high cohesion
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment class with high cohesion
class Enrollment implements EnrollmentSystem {
    private List<student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment() {
        this.enrolledStudents = new ArrayList<student>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println("Enrolled student " + student.getStudentName() +
                " in course " + course.getCourseName());
    }

    @Override
    public void dropStudent(student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Dropped student " + student.getStudentName() +
                    " from course " + course.getCourseName());
        } else {
            System.out.println("Student not enrolled in the specified course.");
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() +
                    ", Course: " + enrolledCourses.get(i).getCourseName());
        }
    }
}

public class School {
    public static void main(String[] args) {
        // Demonstrate loose coupling and high cohesion
        EnrollmentSystem enrollmentSystem = new Enrollment();
        student student1 = new student("S001", "John Doe");
        student student2 = new student("S002", "Jane Smith");
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course2);
        enrollmentSystem.displayEnrollmentDetails();
    }
}
