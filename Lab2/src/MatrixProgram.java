import java.util.Scanner;

public class MatrixProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of matrix columns (no more than 20):");
        int ColumnsNumber = scanner.nextInt();
        System.out.println("Enter the number of matrix rows (no more than 20):");
        int RowsNumber = scanner.nextInt();

        Matrix matrix = new Matrix(ColumnsNumber, RowsNumber);

        System.out.println("Choose the matrix filling method:");
        System.out.println("1. Manually");
        System.out.println("2. Randomly");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix.fillMatrixFromKeyboard();
        } else if (choice == 2) {
            matrix.fillMatrixRandomly();
        } else {
            System.out.println("Wrong choice");
            return;
        }

        System.out.println("Matrix:");
        for (int i = 0; i < RowsNumber; i++) {
            for (int j = 0; j < ColumnsNumber; j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Minimal element: " + matrix.findMin());
        System.out.println("Maximum element: " + matrix.findMax());
        System.out.println("Arithmetic mean: " + matrix.calculateAverage());
    }
}