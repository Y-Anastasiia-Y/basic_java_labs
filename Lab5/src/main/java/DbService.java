import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbService {
    private final ConnectionConfiguration configuration;
    private final String SqlQueryTemplate = "SELECT * FROM Students WHERE MONTH(Date_of_Birth) = ?";

    public DbService(ConnectionConfiguration configuration) {
        this.configuration = configuration;
    }

    public List<Student> getStudentsByBirthMonth(Integer monthNumber) throws SQLException {
        Connection connection = DriverManager.getConnection(configuration.getJDBC_URL(), configuration.getUSER(), configuration.getPASSWORD());
        // Підключення успішне
        System.out.println("Підключення до бази даних успішне.");

        PreparedStatement statement = connection.prepareStatement(SqlQueryTemplate);
        // Передача параметру місяця до SQL-запиту
        statement.setString(1, monthNumber.toString());

        // Виконання запиту та отримання результатів
        ResultSet resultSet = statement.executeQuery();

        // Отимання результатів
        List<Student> students = new ArrayList<>();

        while (resultSet.next()) {
            String lastName = resultSet.getString("Last_Name");
            String firstName = resultSet.getString("First_Name");
            String middleName = resultSet.getString("Middle_Name");
            Date dob = resultSet.getDate("Date_of_Birth");
            String studentID = resultSet.getString("Student_ID");

            students.add(new Student(firstName, lastName, middleName, dob, studentID));
        }

        return students;
    }
}
