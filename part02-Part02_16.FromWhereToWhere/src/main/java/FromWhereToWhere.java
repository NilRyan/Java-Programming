
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int limit = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int initial = Integer.valueOf(scanner.nextLine());

        for (int i = initial; i <= limit; i++) {
            System.out.println(i);
        }
    }
}
