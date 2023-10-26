import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondSum = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNum.add(secondSum);

        System.out.println(sum);
    }
}
