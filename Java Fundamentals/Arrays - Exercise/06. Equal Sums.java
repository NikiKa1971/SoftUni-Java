import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int index = 0;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            rightSum += inputArr[i];
        }

        for (int i = 0; i < inputArr.length; i++) {
            rightSum -= inputArr[i];

            if (rightSum == leftSum) {
                System.out.printf("%d", i);
                return;
            }
            leftSum += inputArr[i];
        }
        System.out.println("no");
    }
}
