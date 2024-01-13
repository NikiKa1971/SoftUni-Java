import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (true) {
            String input = scanner.nextLine();
            if ("print".equals(input)) break;

            switch (input) {
                case "cancel":
                    if (queue.isEmpty()) {
                        System.out.println("Printer is on standby");
                    } else {

                        System.out.println("Canceled " + queue.poll());
                    }
                    break;
                default:
                    queue.offer(input);
                    break;
            }
        }

        while (!queue.isEmpty()) {
            System.out.printf("%s%n", queue.poll());
        }
    }
}
