import java.util.Scanner;

public class StudentGradingSystem {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Number of subjects
            int subjects = 5;
            double totalMarks = 0;

            // Input marks for each subject
            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                double mark = sc.nextDouble();  // keyboard input
                totalMarks += mark;
            }

            // Assuming each subject is out of 100
            double percentage = (totalMarks / (subjects * 100)) * 100;

            // Assign grade
            String grade;
            if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 30) {
                grade = "C";
            } else {
                grade = "Fail";
            }

            // Output results
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);

            sc.close();
        }
    }

