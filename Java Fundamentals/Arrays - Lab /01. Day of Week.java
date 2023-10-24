import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (n <=days.length && n > 0) {
            System.out.printf("%s", days[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
