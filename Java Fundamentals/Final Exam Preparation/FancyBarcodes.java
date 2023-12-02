import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int barcodesCount = Integer.parseInt(scanner.nextLine());
        String regex = "(@[#]+)(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])(@[#]+)";

        for (int i = 0; i < barcodesCount; i++) {

            String currentBarcode = scanner.nextLine();
            currentBarcode = isValidBarcode(currentBarcode);
            if (currentBarcode.isEmpty()) {
                System.out.println("Invalid barcode");
                continue;
            }
            String group = "";

            for (int j = 0; j < currentBarcode.length(); j++) {
                char symbol = currentBarcode.charAt(j);
                if (Character.isDigit(symbol)) {
                    group += symbol;
                }
            }

            if (group.isEmpty()) {
                group = "00";
            }

            System.out.printf("Product group: %s\n", group);
        }
    }

    private static String isValidBarcode(String currentBarcode) {
        String regex = "(@[#]+)(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])(@[#]+)";
        String barcode = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(currentBarcode);
        while (matcher.find()) {
            barcode = matcher.group("pass");
        }

        return barcode;
    }
}
