import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> queue = new PriorityQueue<>();

        Collections.addAll(queue, input);
        int cicle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < count; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cicle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cicle++;
        }

        System.out.println("Last is " + queue.peek());
    }

    // check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}