
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        while (input != -1) {
            if (input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            count++;
            sum = sum + input;
            input = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Average" + ((double) sum / count));
        System.out.println("Numbers: " + count);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
