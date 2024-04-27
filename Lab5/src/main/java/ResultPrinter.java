import java.util.List;

public class ResultPrinter {
    public void printStudents(List<Student> students, Integer monthNumber) {

        if (students.isEmpty()) {
            System.out.println("Студенти, які народилися в " + monthNumber + " місяці, відсутні.");
        } else {
            System.out.println("Студенти, які народилися в " + monthNumber + " місяці:");

            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
