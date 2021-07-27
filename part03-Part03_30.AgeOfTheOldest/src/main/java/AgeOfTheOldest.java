
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        takes a string that contains comma separated name and age
// outputs oldest "Age of the oldest: "
        int oldest = 0;
        
        while(true) {
           
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] arr = input.split(",");
                if(oldest < Integer.valueOf(arr[1])){
                    oldest = Integer.valueOf(arr[1]);
                }
             
        }
        System.out.println("Age of the oldest " + oldest);

    }
}
