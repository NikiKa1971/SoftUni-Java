import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands[0]; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < commands[1]; i++) {
            stack.pop();
        }

// without queue - less code but slowest - 0.037s

        if (stack.contains(commands[2])) {
            System.out.println(true);
        } else if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(stack)); // smallest number
        }

    }
}
