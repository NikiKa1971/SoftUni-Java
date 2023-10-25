import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
     
        if (input.length > 1) {
            int[] condensed = new int[input.length - 1];

            while (condensed.length >= 1) {
                for (int i = 0; i < condensed.length; i++) {
                    condensed[i] = input[i] + input[i + 1];
                }
                input = condensed;
                if (input.length > 1) {
                    condensed = new int[input.length - 1];
                } else {
                    input = condensed;
                    break;
                }
            }
        }
        int result = input[0];
        System.out.printf("%d", result);
    }
}
