import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        findTopNumbers(number);
    }

    private static void findTopNumbers(int number) {
        for (int numbers = 1; numbers <= number; numbers++) { // each number between 1 and N
            int sum = 0;
            boolean isContainsOddDigit = false;
            String[] currentNumber = (numbers + "").split("");

            for (int i = 0; i < currentNumber.length; i++) {
                sum += Integer.parseInt(currentNumber[i]);
                if (Integer.parseInt(currentNumber[i]) % 2 != 0) {
                    isContainsOddDigit = true;
                }
            }

            if (sum % 8 == 0 && isContainsOddDigit) {
                System.out.printf("%d%n", numbers);
            }
        }
    }
}
