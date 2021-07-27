
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        
        while (!string.isEmpty()) {
            String[] split = string.split(" ");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
            string = scanner.nextLine();
        }


    }
}
