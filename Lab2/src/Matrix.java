import java.util.Scanner;//класс java.util.Scanner Он считє дані из источника (из строки, из файла, из консоли), распознает, обрабатывает

public class Matrix { //клас Matrix, який представляє собою матрицю з цілими числами
    public int[][] matrix;//оголошення змінної matrix, яка є двовимірним масивом цілих чисел.
    private int ColumnsNumber; //оголошення змінної типу приват, кількість стовбців
    private int RowsNumber; //оголошення змінної типу приват, кількість рядків матриці.
    private static final int MAX_SIZE = 20; //є статичними (доступний в рамках класу)
    private static final int RANDOM_RANGE = 100;//і константними (їх значення не можна змінити після ініціалізації).

    // Конструктор класу
    public Matrix(int ColumnsNumber, int RowsNumber) {
        this.ColumnsNumber = Math.min(ColumnsNumber, MAX_SIZE);
        this.RowsNumber = Math.min(RowsNumber, MAX_SIZE);
        this.matrix = new int[this.RowsNumber][this.ColumnsNumber];
    }

    // Метод для заповнення матриці з клавіатури
    public void fillMatrixFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Метод для заповнення матриці рандомними числами
    public void fillMatrixRandomly() {
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                matrix[i][j] = (int) (Math.random() * RANDOM_RANGE); //генерує випадкове ціле число від 0 до RANDOM_RANGE - 1 і присвоює його елементу матриці
            }                                                                   //Math.random() - метод класу Math, генерує випадкове дробове число  від 0 до 1
        }                                                                       //(int) - Це приведення типу даних до цілого числа.
    }                                                                                    // Воно конвертує результат, Math.random() * RANDOM_RANGE, в ціле число

    // Метод для пошуку мінімального елементу
    public int findMin() {
        int min = matrix[0][0];
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // Метод для пошуку максимального елементу
    public int findMax() {
        int max = matrix[0][0];
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Метод для обчислення середнього арифметичного
    public double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                sum += matrix[i][j];
            }
        }
        return (double) sum / (ColumnsNumber * RowsNumber);
    }
}




