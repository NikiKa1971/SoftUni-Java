import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] train = new int[n];

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            train[i] = people;
            sum += people;
        }
        for (int wagon : train) {
            System.out.printf("%d ", wagon);
        }
        System.out.printf("\n%d",sum);
    }
}
