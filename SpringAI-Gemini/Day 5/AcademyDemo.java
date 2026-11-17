class StudentProfile {

    String name;
    int studentId;
    double score;

    // Constructor for students with entrance exam score
    StudentProfile(String name, int studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // Constructor for direct walk-in students
    StudentProfile(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.score = 0.0;
    }

    // Determine grade
    char getGrade() {

        if (score >= 90) {
            return 'A';
        } 
        else if (score >= 75) {
            return 'B';
        } 
        else if (score >= 50) {
            return 'C';
        } 
        else {
            return 'F';
        }
    }

    // Print report card
    void printReportCard() {

        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + getGrade());
        System.out.println("----------------------");
    }
}

public class AcademyDemo {

    public static void main(String[] args) {

        // Student with score
        StudentProfile student1 =
                new StudentProfile("Yash", 101, 82.5);

        // Walk-in student without score
        StudentProfile student2 =
                new StudentProfile("Rahul", 102);

        student1.printReportCard();
        student2.printReportCard();
    }
}