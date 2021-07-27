
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while(!string.trim().isEmpty()){
            String[] array = string.split(" ");
            System.out.println(array[0]);
            string = scanner.nextLine();
        }
    }
}
