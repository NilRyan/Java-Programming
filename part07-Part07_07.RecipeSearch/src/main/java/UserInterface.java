
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
                + "stop - stops the program \n"
                + "find name - searches recipes by name \n"
                + "find cooking time - searches recipes by cooking time \n"
                + "find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.println("Enter a command:");
            String command = scanner.nextLine();
            System.out.println("");
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {

                printRecipes(this.recipes);
                System.out.println("");
                continue;
            }

            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String search = scanner.nextLine();
                printRecipes(recipes.findRecipeByName(search));
                System.out.println("");
                continue;
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int cookingTime = Integer.valueOf(scanner.nextLine());

                printRecipes(recipes.findRecipeByCookingTime(cookingTime));
                System.out.println("");
                continue;
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                
                printRecipes(recipes.findRecipeByIngredient(ingredient));
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

    public void printRecipes(Recipes recipes) {
        System.out.println("");
        System.out.println("Recipes:");
        if (recipes.recipeCount() == 0) {
            return;
        }
        for (Recipe recipe : recipes.getRecipes()) {
            System.out.println(recipe);
        }
    }
}
