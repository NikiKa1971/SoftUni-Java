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

        String[] inputLine = scanner.nextLine().replaceAll(" ", "").split(",");

        for (String currentD : inputLine) {

            int healthSum = getHealthSum(currentD, regexSymbols);

            double damageSum = getDamageSum(currentD, regexDigits);

            System.out.printf("%s - %d health, %.2f damage%n", currentD, healthSum, damageSum);

        }
    }

    private static double getDamageSum(String currentD, String regexDigits) {

        Pattern pattern = Pattern.compile(regexDigits);
        Matcher currentString = pattern.matcher(currentD);
        double damageSum = 0.0;

        while (currentString.find()) {
            damageSum += Double.parseDouble(currentString.group());
        }

        if (currentD.contains("*") || currentD.contains("/")) {
            for (int j = 0; j < currentD.length(); j++) { // check for multiply and divide operators
                if (currentD.charAt(j) == '*') {
                    damageSum *= 2;
                } else if (currentD.charAt(j) == '/') {
                    damageSum /= 2;
                }
            }
        }
        return damageSum;
    }

    private static int getHealthSum(String currentD, String regexSymbols) {
        Pattern pattern = Pattern.compile(regexSymbols);
        Matcher currentString = pattern.matcher(currentD);
        int healthSum = 0;

        while (currentString.find()) {
            char[] health = currentString.group("health").toCharArray();
            for (int j = 0; j < health.length; j++) {
                healthSum += health[j];
            }
        }
        return healthSum;
    }
}
