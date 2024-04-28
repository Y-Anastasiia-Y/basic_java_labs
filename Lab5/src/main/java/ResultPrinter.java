import java.util.List;

public class ResultPrinter {
    public void printStudents(List<Student> students, Integer monthNumber) {

        if (students.isEmpty()) {
            System.out.println("No students born in " + monthNumber + "th month.");
        } else {
            System.out.println("Students who were born in the " + monthNumber + "th month:");

            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
