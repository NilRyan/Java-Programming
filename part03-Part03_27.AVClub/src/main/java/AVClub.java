
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        
        while (!string.trim().isEmpty()){
            String[] array = string.split(" ");
            for (int i = 0; i < array.length; i++){
                if(array[i].contains("av")){
                    System.out.println(array[i]);
                }
            }
            string = scanner.nextLine();
        }

    }
}
