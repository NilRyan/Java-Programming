
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        int input = Integer.valueOf(scanner.nextLine());
        while (input != 9999) {
            list.add(input);
            input = Integer.valueOf(scanner.nextLine());
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }

}
