import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] + inputArr[j] == number) {
                    System.out.printf("%d %d%n", inputArr[i], inputArr[j]);
                }
            }
        }
    }
}
