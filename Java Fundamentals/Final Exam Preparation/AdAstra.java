import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        StringBuilder foodList = new StringBuilder();
        int totalCalories = 0;
        String regex =
                "([#|])(?<foodName>[A-Za-z\\s]+)\\1(?<expDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputLine);

        while (matcher.find()) {
            String foodName = matcher.group("foodName");
            String expDate = matcher.group("expDate");
            String calories = matcher.group("calories");
            totalCalories += Integer.parseInt(calories);
            String currentFood =
                    String.format("Item: %s, Best before: %s, Nutrition: %s%n", foodName, expDate, calories);
            foodList.append(currentFood);
        }

        int remainingDays = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", remainingDays);
        System.out.println(foodList);


    }
}
/*
Calculate the total calories of all food items and then determine how many days you can
last with the food you have. Keep in mind that you need 2000kcal a day.
 */