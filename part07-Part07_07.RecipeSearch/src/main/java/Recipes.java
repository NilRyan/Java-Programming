
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
    
    public Recipes findRecipeByName(String name) {
        Recipes foundRecipes = new Recipes();
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(name)) {
                foundRecipes.addRecipe(recipe);
            }
        }
        
        return foundRecipes;
    }
    
    public Recipes findRecipeByCookingTime(int cookingTime) {
        Recipes foundRecipes = new Recipes();
        for (Recipe recipe: this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                foundRecipes.addRecipe(recipe);
            }
        }
        
        return foundRecipes;
    }
    
    public Recipes findRecipeByIngredient(String ingredient) {
        Recipes foundRecipes = new Recipes();
        for (Recipe recipe: this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                foundRecipes.addRecipe(recipe);
            }
        }
        
        return foundRecipes;

    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
    
    public int recipeCount() {
        return this.recipes.size();
    }
   
}
