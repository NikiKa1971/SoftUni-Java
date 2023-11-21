import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex =
                "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";

        double totalSum = 0;

        while (true) {
            String currentInput = scanner.nextLine();
            if (currentInput.equals("end of shift")) break;

            Pattern pattern = Pattern.compile(regex);
            Matcher currentCustomer = pattern.matcher(currentInput);

            while (currentCustomer.find()) {
                String customerName = currentCustomer.group("customer");
                String product = currentCustomer.group("product");
                double price = Double.parseDouble(currentCustomer.group("price"));
                int quantity = Integer.parseInt(currentCustomer.group("count"));
                double sum = quantity * price;
                totalSum += sum;
                System.out.printf("%s: %s - %.2f%n", customerName, product, sum);
            }
        }

        System.out.printf("Total income: %.2f", totalSum);
    }
}
