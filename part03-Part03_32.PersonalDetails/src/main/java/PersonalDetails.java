
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int count = 0; 
        int sum = 0;
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] arr = input.split(",");
            count++;
            sum += Integer.valueOf(arr[1]);
            if(longestName.length() < arr[0].length()){
                longestName = arr[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / count);

    }
}
