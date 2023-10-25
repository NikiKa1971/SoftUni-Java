import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true) {
            String[] commandsArr = scanner.nextLine().split(" ");
            if (commandsArr[0].equals("end")) {
                break;
            }

            int index1 = 0;
            int index2 = 0;
            int temp = 0;

            switch (commandsArr[0]) {
                case "swap":
                    index1 = Integer.parseInt(commandsArr[1]);
                    index2 = Integer.parseInt(commandsArr[2]);
                    temp = inputArr[index1];
                    inputArr[index1] = inputArr[index2];
                    inputArr[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commandsArr[1]);
                    index2 = Integer.parseInt(commandsArr[2]);
                    temp = inputArr[index1];
                    temp *= inputArr[index2];
                    inputArr[index1] = temp;
                    break;
                case "decrease":
                    for (int i = 0; i < inputArr.length; i++) {
                        inputArr[i]--;
                    }
                    break;
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (i < inputArr.length-1){
                System.out.printf("%d, ",inputArr[i]);
            }else {
                System.out.printf("%d",inputArr[i]);
            }
        }
    }
}
