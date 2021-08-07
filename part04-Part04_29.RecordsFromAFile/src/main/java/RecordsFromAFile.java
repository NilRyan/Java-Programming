
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner content = new Scanner(Paths.get(fileName))) {
            while (content.hasNextLine()) {
                String line = content.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.valueOf(data[1]);
                
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
