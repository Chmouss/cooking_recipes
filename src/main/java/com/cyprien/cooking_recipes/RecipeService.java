package com.cyprien.cooking_recipes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll(); //optimize with .stream().map .....
    }

    public void insertRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }
}
