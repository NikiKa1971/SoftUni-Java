import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = getSum(first, second);
        int subtract = subtract(sum, third);

        System.out.println(subtract);
    }

    private static int subtract(int sum, int third) {
        return sum - third;
    }

    private static int getSum(int first, int second) {
        return first + second;
    }
}
