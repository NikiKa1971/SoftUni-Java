import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multiplayer = Integer.parseInt(scanner.nextLine());

        if (multiplayer > 10) {
            System.out.printf("%d X %d = %d%n", n, multiplayer, n * multiplayer);
        } else {
            for (int i = multiplayer; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }
    }
}
