import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        String[] temp = new String[arr.length];
       
            for (int j = 1; j <= rotations; j++) {
                String current = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    temp[i - 1] = arr[i];
                }
                temp[temp.length - 1] = current;
                arr = temp;
        }

        System.out.println(String.join(" ", arr));
    }
}
