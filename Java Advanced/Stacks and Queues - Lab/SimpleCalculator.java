import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,input);

        while (stack.size() >1) {
            int firstDigit = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondDigit = Integer.parseInt(stack.pop());

            switch (operator) {
                case "+":
                    stack.push(String.valueOf(firstDigit+secondDigit));
                    break;
                case "-":
                    stack.push(String.valueOf(firstDigit-secondDigit));
                    break;
            }
        }
        System.out.println(stack.peek());
    }
}