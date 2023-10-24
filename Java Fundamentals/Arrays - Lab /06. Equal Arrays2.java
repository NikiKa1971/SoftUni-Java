import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).
                toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int length = Math.max(firstArr.length, secondArr.length);
        int sum = 0;
        int difference = 0;
        boolean isEqual = false;

        for (int i = 0; i < length; i++) {
            if (firstArr[i] == secondArr[i]) {
                isEqual = true;
                sum += firstArr[i];
            } else {
                isEqual = false;
                difference = i;
                break;
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",difference);
        }
    }
}
