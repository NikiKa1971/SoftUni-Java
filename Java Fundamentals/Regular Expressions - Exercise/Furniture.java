import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex =
                ">>(?<furnitureName>[A-Za-z]+)<<(?<price>\\d+(.\\d+)?)!(?<quantity>[0-9]+)";
        List<String> furnitureList = new ArrayList<>();
        double totalSum = 0;

        while (true) {
            String currentInput = scanner.nextLine();
            if (currentInput.equals("Purchase")) break;

            Pattern pattern = Pattern.compile(regex);
            Matcher furniture = pattern.matcher(currentInput);

            while (furniture.find()) {
                String currentFurniture = furniture.group("furnitureName");
                double price = Double.parseDouble(furniture.group("price"));
                int quantity = Integer.parseInt(furniture.group("quantity"));
                double sum = quantity * price;
                totalSum += sum;
                furnitureList.add(currentFurniture);
            }
        }

        System.out.println("Bought furniture:");

        for (String item : furnitureList) {
            System.out.println(item);
        }

        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
