import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> leftBracket = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            if ("(".equals(input.charAt(i) + "")) {
                leftBracket.push(String.valueOf(i));
            }
            if (")".equals(input.charAt(i) + "")) {

                int index = Integer.parseInt(leftBracket.pop());
                System.out.println(input.substring(index, i + 1));
            }
        }

    }
}
