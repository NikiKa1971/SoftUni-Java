import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (true) {
            String input = scanner.nextLine();
            if ("Home".equals(input)) break;

            switch (input) {
                case "back":
                    if (back.size() <2) {
                        System.out.println("no previous URLs");
                    } else {
                        forward.push(back.pop());
                        System.out.println(back.peek());
                    }
                    break;

                case "forward":
                    if (forward.isEmpty()) {
                        System.out.println("no next URLs");
                    } else {
                        String currentFW = forward.pop();
                        System.out.println(currentFW);
                        back.push(currentFW);
                    }
                    break;
                default:
                    System.out.println(input);
                    back.push(input);
                    forward.clear();
                    break;
            }
        }
    }
}
