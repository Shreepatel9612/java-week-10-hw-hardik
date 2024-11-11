import java.util.Scanner;

public class MarkSheet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name and roll number
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        // Input and validate marks for each subject using a while loop
        int math = getValidatedMarks(scanner, "Math");
        int science = getValidatedMarks(scanner, "Science");
        int english = getValidatedMarks(scanner, "English");

        // Calculate total, percentage, and determine if the student has passed each subject
        int total = math + science + english;
        double percentage = total / 3.0;

        // Check if the student passed each subject
        boolean isPassInAllSubjects = (math >= 35) && (science >= 35) && (english >= 35);
        String result;

        // Determine result based on individual subjects and overall percentage
        if (isPassInAllSubjects && percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Determine grade based on percentage
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print Mark Sheet
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("| Name      : " + name + "             |");
        System.out.println("| Roll No   : " + rollNo + "               |");
        System.out.println("|_____________________________|");
        System.out.println("| Subjects    : Marks         |");
        System.out.println("|_____________________________|");
        System.out.println("| Math       : " + math + "               |");
        System.out.println("| Science    : " + science + "            |");
        System.out.println("| English    : " + english + "            |");
        System.out.println("|_____________________________|");
        System.out.println("| Total      : " + total + "             |");
        System.out.println("|_____________________________|");
        System.out.printf("| Percentage : %.1f            |\n", percentage);
        System.out.println("| Result     : " + result + "              |");
        System.out.println("| Grade      : " + grade + "               |");
        System.out.println("|_____________________________|");

        scanner.close();
    }

    // Method to input marks with validation using a while loop
    private static int getValidatedMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + " (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break; // Exit loop if marks are within the valid range
            } else {
                System.out.println("Invalid Input. Marks should be between 0 and 100. Please try again.");
            }
        }
        return marks;
    }
}
