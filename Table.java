public class Table {
    public static void main(String[] args) {

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[32;1m";
        final String COLOR_YELLOW_BOLD = "\033[33;1m";
        final String RESET = "\033[30;0m";

        String name = "Kasun sampath";
        int age  = 15;
        String subject1 = "SE-5";
        String subject2 = "SE-45";
        String subject3 = "SE-300";
        double marks1 = 48.25;
        double marks2 = 75.22;
        double marks3 = 55.26;

        double total = marks1 + marks2 + marks3;
        double avg = total / 3;

        /*
         * Distinguist pass (DP) >= 75 (blue)
         * Credit pass (CP) >= 65 (green)
         * pass (p) >= 55 (yellow)
         * fail (f) < 55 (red)
         */

        String status;  // overall status
        String subject1Status;
        String subject2Status;
        String subject3Status;

        final String DISTINGUIST_PASS = COLOR_BLUE_BOLD + "DISTINGUIS PASS (DP)" + RESET;
        final String CREDIT_PASS = COLOR_GREEN_BOLD + "CREDIT PASS (CP)" +RESET;
        final String PASS = COLOR_YELLOW_BOLD + "PASS (P)" + RESET;
        final String FAIL = COLOR_RED_BOLD + "FAIL (F)" + RESET;

        
        // Overall status
        if (avg >= 75) status = "Distinguist pass (DP)";
        else if (avg >= 65) status = "Credit pass (CP)";
        else if (avg >= 55) status = "pass (p)";
        else status = "fail";

        // subject 1 status
        if (marks1 >= 75) subject1Status = DISTINGUIST_PASS;
        else if (marks1 >= 65) subject1Status = CREDIT_PASS;
        else if (marks1 >= 55) subject1Status = PASS;
        else subject1Status = FAIL;

       // subject 2 status
        if (marks2 >= 75) subject2Status = DISTINGUIST_PASS;
        else if (marks2 >= 65) subject2Status = CREDIT_PASS;
        else if (marks2 >= 55) subject2Status = PASS;
        else subject2Status = FAIL;

        // subject 3 status
        if (marks3 >= 75) subject3Status = DISTINGUIST_PASS;
        else if (marks3 >= 65) subject3Status = CREDIT_PASS;
        else if (marks3 >= 55) subject3Status = PASS;
        else subject3Status = FAIL;

        subject1 = String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
        subject2 = String.format("SE-%03d", Integer.valueOf(subject2.substring(3)));
        subject3 = String.format("SE-%03d", Integer.valueOf(subject3.substring(3)));

        name = String.format("%s%s%s",COLOR_BLUE_BOLD,name.toUpperCase(),RESET);

        // Let's generate the table
        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("|%10s: %-52s|\n","Name",name);
        System.out.printf("|%10s: %-38s|\n","age",age + " years old");
        System.out.printf("|%10s: %-38s|\n","status",status.toUpperCase());
        System.out.printf("|%10s: %-38s|\n","Total",String.format("%.2f", total));
        System.out.printf("|%10s: %-38s|\n","Average",String.format("%.2f", avg).concat("%"));
        
        final String LINE = "+".concat("-".repeat(10)).concat("+").concat("-".repeat(12).concat("+").concat("-".repeat(26)).concat("+"));
        System.out.println(LINE);
        System.out.printf("|%-10s|%-12s|%-26s|\n","Subject","Marks","Grade");
        System.out.println(LINE);
        System.out.printf("|%-10s|%-12.2f|%-40s|\n",subject1,marks1,subject1Status);
        System.out.printf("|%-10s|%-12.2f|%-36s|\n",subject2,marks2,subject2Status);
        System.out.printf("|%-10s|%-12.2f|%-26s|\n",subject3,marks3,subject3Status);
        System.out.println("+".concat("-".repeat(50)).concat("+"));
        
    }
}