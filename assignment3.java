import java.util.Scanner;

public class assignment3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        boolean isInvalidName = name.strip().length() == 0 || name.strip().equals("-");

        if (isInvalidName) {
            System.out.println("\u001B[31mInvalid Name\u001B[0m"); // ANSI escape code for red color
        } else {
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            validateSubjectAndMarks("Subject1", "SE - ", 1);
            validateSubjectAndMarks("Subject2", "SE - ", 2);
            validateSubjectAndMarks("Subject3", "SE - ", 3);

            System.out.println("All information correctly stored.");
        }
    }

    private static void validateSubjectAndMarks(String subjectName, String prefix, int subjectNumber) {
        System.out.printf("Enter your %s (Format: %sX): ", subjectName, prefix);
        String subjectInput = scanner.nextLine();

        if (!subjectInput.strip().startsWith(prefix)) {
            System.out.printf("\u001B[31m%s code is wrong\u001B[0m%n", subjectName);
        } else {
            System.out.printf("Enter Your Marks%d: ", subjectNumber);
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.printf("\u001B[31mInvalid Marks%d\u001B[0m%n", subjectNumber);
            }
        }
    }
}
