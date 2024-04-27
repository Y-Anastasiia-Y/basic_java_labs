import java.util.Date;

public class Student {
    private String lastName;
    private String firstName;
    private String middleName;
    private Date dateOfBirth;
    private String studentID;

    // Конструктор
    public Student(String lastName, String firstName, String middleName, Date dateOfBirth, String studentID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStudentID() {
        return studentID;
    }

    // Перевизначення методу toString() для зручного виводу інформації про студента
    @Override
    public String toString() {
        return lastName +
                " " + firstName +
                " " + middleName +
                " - " + dateOfBirth +
                " - " + studentID;
    }
}