import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumberswithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        
        Deque<Integer> numbers = new ArrayDeque<>();
        
        for (String element : input) {
            numbers.push(Integer.parseInt(element));
        }

        for (int i = input.length; i > 0; i--) {
            System.out.printf("%d ", numbers.pop());
        }

    }
}
