import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loops = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> resultStack = new ArrayDeque<>();

        for (int i = 1; i <= loops; i++) {

            String[] commands = scanner.nextLine().split("\\s+");

            switch (commands[0]) {
                case "1":
                    resultStack.push(Integer.parseInt(commands[1]));
                    break;
                case "2":
                    if (!resultStack.isEmpty()) {
                        resultStack.pop();
                    }
                    break;
                case "3":
                    if (!resultStack.isEmpty()) {
                        System.out.println(Collections.max(resultStack));
                    }
                    break;
            }
        }
    }
}
