
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                inputCount++;
                sum = sum + input;
            }
        }
        
        double average = (double) sum / inputCount;
        System.out.println("Average of the numbers: " + average);
    }
}
