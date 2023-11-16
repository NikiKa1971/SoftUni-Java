import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) break;

            char[] chars = inputString.toCharArray();
            List<String> reversedString = new ArrayList<>();

            for (int i = chars.length - 1; i >= 0; i--) {
                reversedString.add(chars[i] + "");
            }

            System.out.printf("%s = %s%n", inputString, String.join("", reversedString));
        }
    }
}
