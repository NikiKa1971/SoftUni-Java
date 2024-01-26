import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isFound = findNumber(matrix, number);

        if (!isFound) System.out.println("not found");


    }

    private static boolean findNumber(int[][] matrix, int number) {
        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {

            int[] currentRow = matrix[i];

            for (int j = 0; j < currentRow.length; j++) {
                if (number == currentRow[j]) {
                    System.out.printf("%d %d%n", i, j);
                    isFound = true;
                }
            }
        }
        return isFound;
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] matrixSize = readArray(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr = readArray(scanner);
            matrix[i] = arr;
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
