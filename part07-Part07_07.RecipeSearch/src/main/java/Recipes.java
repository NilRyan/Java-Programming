
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Recipes {
    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
    
    public ArrayList<Recipe> findRecipe(String name) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(name)) {
                foundRecipes.add(recipe);
            }
        }
        
        return foundRecipes;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
   
}
