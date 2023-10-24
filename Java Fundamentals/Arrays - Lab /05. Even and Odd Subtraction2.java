import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenSum += numArr[i];
            } else {
                oddSum += numArr[i];
            }
        }
        
        int difference = evenSum - oddSum;
        System.out.printf("%d", difference);
    }
}
