import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


           Double grade = Double.parseDouble(scanner.nextLine());

           if (grade>=3){
               System.out.println("Passed!");
           }else {
               System.out.println("Failed!");
           }
    }
}
