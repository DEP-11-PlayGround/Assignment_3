import java.util.Scanner;

public class assignment3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[32;1m";
        final String COLOR_YELLOW_BOLD = "\033[33;1m";
        final String RESET = "\033[30;0m";

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;

        final String ERROR_MSG = String.format("%s%s%s \n", COLOR_RED_BOLD, "%s", RESET);

        app: {
            System.out.print("Enter your name: ");
            name = scanner.nextLine().strip();

            if (name.length() == 0) {
                System.out.printf(ERROR_MSG, "Name can't be empty");
                break app;
            }

            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            // scanner.skip(System.lineSeparator());

            if (age < 10 || age > 18) {
                System.out.printf(ERROR_MSG, "Invalid age");
                break app;
            }

            /* Subject 1 */
            System.out.print("Enter subject1: ");
            subject1 = scanner.nextLine().strip();

            if (subject1.isBlank()) {
                System.out.printf(ERROR_MSG, "Subject 1 can't be empty");
                break app;
            } else if (!subject1.startsWith("SE-1")) {
                System.out.printf(ERROR_MSG, "Invalid subject 1");
                break app;
            }
            System.out.printf("Enter marks for %s", subject1);
            marks1 = scanner.nextInt();
            scanner.nextLine();

            if (marks1 > 100 || marks1 < 0) {
                System.out.printf(ERROR_MSG, "Invalid marks");
                break app;
            }

            /* Subject 2 */
            System.out.print("Enter subject2: ");
            subject2 = scanner.nextLine().strip();

            if (subject2.isBlank()) {
                System.out.printf(ERROR_MSG, "Subject 2 can't be empty");
                break app;
            } else if (!subject2.startsWith("SE-2")) {
                System.out.printf(ERROR_MSG, "Invalid subject 2");
                break app;
            } else if (subject2.equals(subject1)) {
                System.out.printf(ERROR_MSG, "Subject already exists");
                break app;
            }

            System.out.printf("Enter marks for %s", subject2);
            marks2 = scanner.nextInt();
            scanner.nextLine();

            if (marks2 > 100 || marks2 < 0) {
                System.out.printf(ERROR_MSG, "Invalid marks");
                break app;
            }

            /* Subject 3 */
            System.out.print("Enter subject3: ");
            subject3 = scanner.nextLine().strip();

            if (subject3.isBlank()) {
                System.out.printf(ERROR_MSG, "Subject 3 can't be empty");
                break app;
            } else if (!subject3.startsWith("SE-3")) {
                System.out.printf(ERROR_MSG, "Invalid subject 3");
                break app;
            } else if (subject3.equals(subject2) || subject3.equals(subject1)) {
                System.out.printf(ERROR_MSG, "Subject already exists");
                break app;
            }

            System.out.printf("Enter marks for %s", subject3);
            marks3 = scanner.nextInt();
            scanner.nextLine();

            if (marks3 > 100 || marks3 < 0) {
                System.out.printf(ERROR_MSG, "Invalid marks");
                break app;
            }
            
        }
    }
    
}

