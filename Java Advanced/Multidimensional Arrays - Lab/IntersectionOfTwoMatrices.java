import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);
        char[][] resultMatrix = new char[rows][cols];

        for (int i = 0; i < firstMatrix.length; i++) {

            char[] firstArr = firstMatrix[i];
            char[] secondArr = secondMatrix[i];
            char[] resultArr = resultMatrix[i];

            for (int j = 0; j < firstArr.length; j++) {
                if (firstArr[j] != secondArr[j]) {
                    resultArr[j] = '*';
                } else {
                    resultArr[j] = firstArr[j];
                }
            }

            for (char symbol : resultArr) {
                System.out.printf("%s ", symbol);
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            matrix[row] = line.toCharArray();
        }
        return matrix;
    }
}
