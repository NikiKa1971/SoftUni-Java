import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();

        while (true) {
            String[] product = scanner.nextLine().split(" ");

            if (product[0].equals("buy")) break;

            double price = Double.parseDouble(product[1]);
            int quantity = Integer.parseInt(product[2]);

            if (productQuantity.containsKey(product[0])) {
                quantity = productQuantity.get(product[0]) + quantity;
                productQuantity.put(product[0], quantity);

            } else {
                productQuantity.put(product[0], quantity);
            }
            productPrice.put(product[0], price);
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            String k = entry.getKey();
            Double v = entry.getValue();
            Double price = productQuantity.get(entry.getKey())*1.0;
            System.out.printf("%s -> %.2f%n", k,v*price);
        }

    }
}

