package com.cyprien.cooking_recipes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getRecipes(){
        return recipeService.getAllRecipes();

//        return List.of(
//                new Recipe(
//                        1,
//                        "Pizza Pepperoni",
//                        "PISHAAAAAAAAAAAA",
//                        List.of("pizza dough", "pepperonis", "mozzarella", "tomato sauce")
//                ),
//                new Recipe(
//                        2,
//                        "Pasta Carbonara",
//                        "you love it ~",
//                        List.of("not fresh pasta", "eggs", "pecorino", "guanciale", "black pepper")
//                )
//        );
    }

    @PostMapping
    public void addNewRecipe(@RequestBody Recipe recipe){
        recipeService.insertRecipe(recipe);
    }


}
