import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0;
        String input = "";
        double discount = 1;

        while (true) {

            input = scanner.nextLine();

            if (input.equalsIgnoreCase("special") || input.equalsIgnoreCase("regular")) {
                if (input.equals("special")) {
                    // Apply 10% discount for special customers
                    discount = 0.9;
                }
                break;
            }
            double price = Double.parseDouble(input);
            if (price > 0) {
                totalCost += price;
            } else {
                System.out.println("Invalid price!");

            }
        }

        if (totalCost == 0) {
            System.out.println("Invalid order!");
        } else {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalCost);
            System.out.printf("Taxes: %.2f$%n", totalCost * 1.2 - (totalCost));
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", totalCost * 1.2 * discount);
        }

    }
}