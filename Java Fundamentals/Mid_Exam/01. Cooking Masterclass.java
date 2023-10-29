import java.awt.desktop.AboutEvent;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        Double flourPrice = Double.parseDouble(scanner.nextLine());
        Double eggPrice = Double.parseDouble(scanner.nextLine());
        Double apronPrice = Double.parseDouble(scanner.nextLine());


        // pack = 1 flour,10 eggs,1 aprons
        int freePackages = students / 5;
        double sum = (apronPrice * Math.ceil(students * 1.2)) + (eggPrice * 10 * (students)) + (flourPrice * (students - freePackages));
        //System.out.println(sum);
        if (sum <= budget) {
            System.out.printf("Items purchased for %.02f$.", sum);
        } else {
            System.out.printf("%.02f$ more needed.", Math.abs(sum - budget));
        }
    }
}
