import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEven = false;

        while (!isEven) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(number));
                isEven = true;
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
