import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[number];
        String[] secondArr = new String[number];


        for (int i = 0; i < number; i++) {
            String[] temp = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArr[i] = temp[1];
                secondArr[i] = temp[0];
            } else {
                firstArr[i] = temp[0];
                secondArr[i] = temp[1];
            }
        }

       
        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));
    }
}
