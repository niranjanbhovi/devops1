
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
