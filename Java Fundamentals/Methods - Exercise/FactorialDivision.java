import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = findFactorial(firstNumber);
        long secondFactorial = findFactorial(secondNumber);

        System.out.printf("%.2f", firstFactorial * 1.0 / secondFactorial);
    }

    private static long findFactorial(int number) {
        long result = 1;
        if (number > 0) {
            result = number;
            for (int i = number - 1; i > 0; i--) {
                result *= i;
            }
        }
        return result;
    }
}


