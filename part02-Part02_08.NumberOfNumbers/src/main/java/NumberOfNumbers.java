
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        output -> total number of inputted values
        input ->  numbers
            if input == 0 break
            0 not counted as an input
         */
        int inputCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else {
                inputCount = inputCount + 1;
            }
        }
        
        System.out.println("Number of numbers: " + inputCount);
    }
}
