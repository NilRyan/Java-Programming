
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            counter++;
            input = scanner.nextLine();
        }
        System.out.println(counter);
    }
}
