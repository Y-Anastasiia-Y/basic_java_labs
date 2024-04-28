public class ConnectionConfiguration {
    private final String JDBC_URL = "jdbc:mysql://localhost:3306/studentsdb";
    private final String USER = "root";
    private final String PASSWORD = "root";

    public String getJDBC_URL() {
        return JDBC_URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
