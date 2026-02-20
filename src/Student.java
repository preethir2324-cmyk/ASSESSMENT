
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 500; // 5 subjects, each out of 100
        String[] subjects = new String[5];
        int[] marks = new int[5];
        int sum = 0;

        // Input subject names and marks
        System.out.println("Enter 5 subjects and their marks (each out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume newline
            sum += marks[i];
        }

        // Calculate percentage
        double percentage = (sum * 100.0) / totalMarks;

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output results
        System.out.println("\n--- Student Result ---");
        for (int i = 0; i < 5; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks Obtained: " + sum + " / " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
