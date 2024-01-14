import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
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

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (Integer el : stack) {
            queue.offer(el);
        }

        if (queue.contains(commands[2])) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(queue.peek());
        }

    }
}
