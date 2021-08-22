
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilryan
 */
public class UserInterface {

    private Recipes recipes;
    private Scanner scanner;

    public UserInterface(Recipes recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("File to read:");
        String path = scanner.nextLine();
        readRecipes(path);

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program");
        System.out.println("");

        while (true) {
            System.out.println("Enter a command:");
            String command = scanner.nextLine();
            System.out.println("");
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes:");
                printRecipes();
                System.out.println("");
                continue;
            }

        }

    }

    public void readRecipes(String path) {
        try (Scanner file = new Scanner(Paths.get(path))) {
            
            while (file.hasNextLine()) {
                String title = file.nextLine();

                // add title here
                int cookingTime = Integer.valueOf(file.nextLine());
                Recipe recipe = new Recipe(title, cookingTime);
                // add time here
                while (true && file.hasNextLine()) {
                    String ingredient = file.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    // add ingredient here
                    recipe.addIngredient(ingredient);
                }
                recipes.addRecipe(recipe);
            }
            
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void printRecipes() {
        for (Recipe recipe : recipes.getRecipes()) {
            System.out.println(recipe);
        }
    }
}
