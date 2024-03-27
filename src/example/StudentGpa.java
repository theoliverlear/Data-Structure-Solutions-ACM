package example;
//=================================-Imports-==================================
import java.util.HashMap;

public class StudentGpa {
    //============================-Variables-=================================
    private HashMap<String, Double> studentsGpa;
    //===========================-Constructors-===============================
    public StudentGpa() {
        this.studentsGpa = new HashMap<>();
    }
    public StudentGpa(HashMap<String, Double> studentsGpa) {
        this.studentsGpa = studentsGpa;
    }
    //=============================-Methods-==================================

    //--------------------------Add-Student-GPA-------------------------------
    public void addStudentGpa(String student, double gpa) {
        this.studentsGpa.put(student, gpa);
    }
    //-------------------------Remove-Student-GPA-----------------------------
    public void removeStudentGpa(String student) {
        this.studentsGpa.remove(student);
    }
    //-------------------------Update-Student-GPA-----------------------------
    public void updateStudentGpa(String student, double gpa) {
        this.studentsGpa.put(student, gpa);
    }
    //--------------------------Get-Student-GPA-------------------------------
    public double getStudentGpa(String student) {
        return this.studentsGpa.get(student);
    }
    //-------------------------Print-Students-GPA-----------------------------
    public void printStudentsGpa() {
        final String MAJOR_DIVIDER = "=".repeat(21);
        final String DIVIDER = "-".repeat(21);
        System.out.println(MAJOR_DIVIDER + "\nStudents GPA");
        this.studentsGpa.forEach((student, gpa) -> {
            System.out.printf("%s%n%-17s %1.1f%n", DIVIDER, student, gpa);
        });
        System.out.println();
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        StudentGpa studentGpa = new StudentGpa();
        studentGpa.addStudentGpa("Alice", 3.5);
        studentGpa.addStudentGpa("Bob", 3.0);
        studentGpa.addStudentGpa("Charlie", 3.2);
        studentGpa.printStudentsGpa();
        studentGpa.updateStudentGpa("Alice", 3.7);
        studentGpa.printStudentsGpa();
        studentGpa.removeStudentGpa("Bob");
        studentGpa.printStudentsGpa();
        System.out.println(studentGpa.getStudentGpa("Charlie"));
    }
}
