import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        String result = "";
        int index = 0;

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {
                if (secondArr[i].equals(firstArr[j])) {
                    //  equalArr[index] = secondArr[i];
                    result += secondArr[i] + " ";
                    index++;
                }
            }
        }
        System.out.println(result);
    }
}
