import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введіть номер місяця (1-12): ");
            String input = scanner.nextLine();

            try {
                monthNumber = Integer.parseInt(input);
                if (monthNumber >= 1 && monthNumber <= 12) {
                    isValidInput = true;
                } else {
                    System.out.println("Неправильне значення місяця. Введіть число від 1 до 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильний формат числа. Введіть число від 1 до 12.");
            }
        }

        DbService dbService = new DbService(new ConnectionConfiguration());
        List<Student> filteredStudents = dbService.getStudentsByBirthMonth(monthNumber);

        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printStudents(filteredStudents, monthNumber);
    }
}
