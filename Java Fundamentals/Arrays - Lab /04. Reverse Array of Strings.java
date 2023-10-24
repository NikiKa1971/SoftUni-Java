import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] stringArr = scanner.nextLine().split(" ");

        for (int i = stringArr.length-1; i >=0; i--) {

            System.out.printf("%s ",stringArr[i]);
        }
    }
}
