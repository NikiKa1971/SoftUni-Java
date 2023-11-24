package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexSymbols =
                "(?<health>[^0-9\\+\\-\\*\\/+\\.])";
        String regexDigits =
                "(?<digits>([-]?\\d+\\.?\\d*))";

        String[] inputLine = scanner.nextLine().replaceAll(" ","").split(",");

        for (int i = 0; i < inputLine.length; i++) {

            String currentD = inputLine[i];

            Pattern pattern = Pattern.compile(regexSymbols);
            Matcher currentString = pattern.matcher(currentD);
            int healthSum = 0;

            while (currentString.find()) {
                char[] health = currentString.group("health").toCharArray();
                for (int j = 0; j < health.length; j++) {
                    healthSum += health[j];
                }
            }

            pattern = Pattern.compile(regexDigits);
            currentString = pattern.matcher(currentD);
            double damageSum = 0.0;

            while (currentString.find()) {
                damageSum += Double.parseDouble(currentString.group());
            }

            for (int j = 0; j < currentD.length(); j++) { // check for multiply and divide operators
                if (currentD.charAt(j) == '*') {
                    damageSum *= 2;
                } else if (currentD.charAt(j) == '/') {
                    damageSum /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", currentD, healthSum, damageSum);

        }
    }
}
