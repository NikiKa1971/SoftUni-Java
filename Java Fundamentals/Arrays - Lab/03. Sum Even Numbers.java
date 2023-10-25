import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int evenSum = 0;

        String[] inputArr = input.split(" ");
        int[] numbersArr = new int[inputArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];
            }
        }
        System.out.printf("%d",evenSum);
    }
}
