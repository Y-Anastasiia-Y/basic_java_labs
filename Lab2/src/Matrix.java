import java.util.Scanner;

public class Matrix {
    public int[][] matrix;
    private int ColumnsNumber;
    private int RowsNumber;
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_RANGE = 100;

    public Matrix(int ColumnsNumber, int RowsNumber) {
        this.ColumnsNumber = Math.min(ColumnsNumber, MAX_SIZE);
        this.RowsNumber = Math.min(RowsNumber, MAX_SIZE);
        this.matrix = new int[this.RowsNumber][this.ColumnsNumber];
    }

    public void fillMatrixFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void fillMatrixRandomly() {
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                matrix[i][j] = (int) (Math.random() * RANDOM_RANGE);
            }
        }
    }

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




