import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hours * 60 + minutes + 30;
        int currentHour = time / 60;
        int currentMinute = time - (currentHour * 60);
        if (currentHour>23){
            currentHour=0;
        }



        if (currentMinute > 9) {
            System.out.printf("%d:%d", currentHour, currentMinute);
        } else {
            System.out.printf("%d:0%d", currentHour, currentMinute);
        }

    }
}
