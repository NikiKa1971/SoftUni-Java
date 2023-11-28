import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printMatrix (number);
    }

    private static void printMatrix(int number) {
        for (int first = 0; first < number; first++) {
            for (int second = 0; second < number; second++) {
                System.out.printf("%d ",number);
            }
            System.out.println();
        }
    }
}
