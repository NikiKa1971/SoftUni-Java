import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double discount = 1;

        switch (typeGroup) {
            case "Students":
                if (peopleCount >= 30) {
                    discount = 0.85;
                }
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                if (peopleCount >= 100) {
                    peopleCount -= 10;
                }
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                if (peopleCount >= 10 && peopleCount <= 20) {
                    discount = 0.95;
                }
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }

        double sum = peopleCount * price * discount;
        System.out.printf("Total price: %.2f", sum);
    }
}
