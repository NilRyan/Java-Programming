
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            } else {
                inputCount++;
                sum = sum + number;
            }
        }

        if (inputCount > 0) {
            double average = (double) sum / inputCount;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
