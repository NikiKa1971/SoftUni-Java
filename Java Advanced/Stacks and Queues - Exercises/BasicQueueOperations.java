import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split("\\s+");

        int elementsToAdd = Integer.parseInt(commands[0]);
        int elementsToPoll = Integer.parseInt(commands[1]);
        int elementToFind = Integer.parseInt(commands[2]);

        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < elementsToAdd; i++) {
            numbersQueue.offer(numbers[i]);
        }

        for (int i = 0; i < elementsToPoll; i++) {
            numbersQueue.poll();
        }
        if (numbersQueue.isEmpty()) {
            System.out.println(0);
        } else if ( numbersQueue.contains(elementToFind)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numbersQueue));
        }
    }
}
/*
You will be given an integer N representing the number of elements to enqueue (add),
an integer S representing the number of elements to dequeue (remove/poll) from the queue,
and finally, an integer X, an element that you should check whether is present in the queue.
If it is - prints true on the console, if it is not - print the smallest element currently present in the queue.

 */