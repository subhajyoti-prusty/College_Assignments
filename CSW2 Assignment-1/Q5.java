class College {
    private String collegeName;
    private String collegeLoc;

    // Constructor for College class
    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    // Getter method for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    // Getter method for collegeLoc
    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college; // Reference to College object

    // Constructor for Student class
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college.getCollegeName() + ", Location: " + college.getCollegeLoc());
        System.out.println();
    }
}

public class Edu {
    public static void main(String[] args) {
        // Instantiate at least two College objects
        College college1 = new College("ABC College", "City1");
        College college2 = new College("XYZ College", "City2");

        // Instantiate at least two Student objects and enroll them in colleges
        Student student1 = new Student(1, "John Doe", college1);
        Student student2 = new Student(2, "Jane Smith", college2);

        // Display information of all colleges
        System.out.println("College Information:");
        System.out.println("1. " + college1.getCollegeName() + ", Location: " + college1.getCollegeLoc());
        System.out.println("2. " + college2.getCollegeName() + ", Location: " + college2.getCollegeLoc());
        System.out.println();

        // Display information of all students
        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
