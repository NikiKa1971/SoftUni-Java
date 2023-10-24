import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numArr = new int[input.length];

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(input[i]);
            if (numArr[i] % 2 == 0) {
                evenSum += numArr[i];
            } else {
                oddSum += numArr[i];
            }
        }
        System.out.printf("%d",evenSum-oddSum);
    }
}
