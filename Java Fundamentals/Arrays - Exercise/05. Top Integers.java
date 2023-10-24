import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < numArr.length ; i++) {
            boolean isBigger = false;
            for (int j = i + 1; j < numArr.length; j++) {
                if ((numArr[i] > numArr[j]) && numArr[i] > numArr[numArr.length - 1]) {
                    isBigger = true;
                } else {
                    break;
                }
            }
            if (isBigger) {

                System.out.printf("%d ", numArr[i]);
            }
        }
        if (numArr.length > 0) {
            System.out.printf("%d ", numArr[numArr.length - 1]);
        }
    }
}
