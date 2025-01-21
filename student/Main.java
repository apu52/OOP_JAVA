import java.util.Scanner;

abstract class Student {
    String studentName;
    int rollNo;

    void setInfo(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    abstract void giveExam();
}

class CseStudent extends Student {
    private String stream = "CSE";

    void giveExam() {
        System.out.println(studentName + " with roll: " + this.rollNo + " from " + this.stream + " gives exam");
    }
}

class ItStudent extends Student {
    String stream = "IT";

    void giveExam() {
        System.out.println(this.studentName + " with roll: " + this.rollNo + " from " + this.stream + " gives exam");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for CSE Student
        System.out.println("Enter details for CSE student:");
        System.out.print("Enter name: ");
        String cseName = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int cseRoll = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        CseStudent cseStudent = new CseStudent();
        cseStudent.setInfo(cseName, cseRoll);

        // Input for IT Student
        System.out.println("\nEnter details for IT student:");
        System.out.print("Enter name: ");
        String itName = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int itRoll = scanner.nextInt();

        ItStudent itStudent = new ItStudent();
        itStudent.setInfo(itName, itRoll);

        // Output
        System.out.println("\nExam Details:");
        cseStudent.giveExam();
        itStudent.giveExam();

        System.out.println("\nUsing Student reference:");
        Student student;

        // Using reference for CseStudent
        student = new CseStudent();
        student.setInfo(cseName, cseRoll);
        student.giveExam();

        // Using reference for ItStudent
        student = new ItStudent();
        student.setInfo(itName, itRoll);
        student.giveExam();

        scanner.close();
    }
}
