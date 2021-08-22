
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();
        UserInterface ui = new UserInterface(recipes, scanner);
        
        ui.start();
 
    }

}
