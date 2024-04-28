import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter month number (1-12): ");
            String input = scanner.nextLine();

            try {
                monthNumber = Integer.parseInt(input);
                if (monthNumber >= 1 && monthNumber <= 12) {
                    isValidInput = true;
                } else {
                    System.out.println("The month is incorrect. Enter a number from 1 to 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number format. Enter a number from 1 to 12.");
            }
        }

        DbService dbService = new DbService(new ConnectionConfiguration());
        List<Student> filteredStudents = dbService.getStudentsByBirthMonth(monthNumber);

        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printStudents(filteredStudents, monthNumber);
    }
}
