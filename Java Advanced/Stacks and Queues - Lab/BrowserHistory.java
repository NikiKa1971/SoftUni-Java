import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (true) {
            String input = scanner.nextLine();
            if ("Home".equals(input)) break;

            if ("back".equals(input)) {
                if (stack.size()<=1) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
              System.out.println(input);
                stack.push(input);
            }
        }
    }
}
/*
https//softuni.bg/
back
https//softuni.bg/trainings/courses
back
https//softuni.bg/trainings/2056
back
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details
Home
 */