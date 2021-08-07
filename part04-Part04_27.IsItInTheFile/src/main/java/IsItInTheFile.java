
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        Boolean found = false;

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner content = new Scanner(Paths.get(file))) {
            while (content.hasNextLine()) {
                String name = content.nextLine();
                if (name.equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }

}
