import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String title = sc.nextLine();
            if (title.isEmpty()) break;
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(sc.nextLine());
            
            books.add(new Books(title, pages, publicationYear));
        }
        
        System.out.println("What information will be printed?");
        String info = sc.nextLine();
        
        if (info.equals("everything")) {
            for (Books book: books) {
                System.out.println(book);
            }
        }
        
        if (info.equals("name")) {        
            for (Books book: books) {
                System.out.println(book.getName());
            }
        }
    }
}
