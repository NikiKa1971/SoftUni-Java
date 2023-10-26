import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger sum = BigInteger.valueOf(number);

        if (number > 0) {
            for (int i = number - 1; i > 0; i--) {
                sum = sum.multiply(BigInteger.valueOf(i));
            }

        } else if (number == 0) {
            sum = BigInteger.valueOf(1);

        }
        System.out.println(sum);
    }
}
