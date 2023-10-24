import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxLength = 0;

        if (firstArr.length >= secondArr.length) {
            maxLength = firstArr.length;
        } else {
            maxLength = secondArr.length;
        }
        boolean Equal = true;
        int index = 0;

        for (int i = 0; i < maxLength; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                index = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                Equal=false;
                break;
            }
        }
        if (Equal) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
