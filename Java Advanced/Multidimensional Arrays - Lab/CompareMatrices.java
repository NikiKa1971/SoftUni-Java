import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = extracted(firstMatrix, secondMatrix);

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean extracted(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) return false;

        for (int row = 0; row < firstMatrix.length; row++) {

            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if (firstArr.length != secondArr.length) return false;

            for (int i = 0; i < firstArr.length; i++) {

                if (firstArr[i] != secondArr[i]) {
                    return false;
                }
            }
        }
        return true;
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
/*
2 3
1 2 3
2 1 3
2 3
1 2 3
2 1 3
 */