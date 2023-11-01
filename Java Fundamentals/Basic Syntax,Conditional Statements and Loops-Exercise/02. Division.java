import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int maxDivision = 0;
        int temp = 0;

        if (number % 2 == 0) {
            temp = 2;
            if (temp > maxDivision) maxDivision = temp;
        }

        if (number % 3 == 0) {
            temp = 3;
            if (temp > maxDivision) maxDivision = temp;
        }
        if (number % 2 == 0 && number % 3 == 0) {
            temp = 6;
            if (temp > maxDivision) maxDivision = temp;
        }
        if (number % 7 == 0) {
            temp = 7;
            if (temp > maxDivision) maxDivision = temp;
        }
        if (number % 10 == 0) {
            temp = 10;
            if (temp > maxDivision) maxDivision = temp;
        }
        if (maxDivision > 0) {
            System.out.printf("The number is divisible by %d", maxDivision);
        } else {
            System.out.println("Not divisible");
        }

    }
}
