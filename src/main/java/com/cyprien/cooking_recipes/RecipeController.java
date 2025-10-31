package com.cyprien.cooking_recipes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeController {

    @GetMapping
    public List<Recipe> getAllRecipes(){
        return List.of(
                new Recipe(
                        1,
                        "Pizza Pepperoni",
                        "PISHAAAAAAAAAAAA",
                        List.of("pizza dough, pepperonis, mozzarella, tomato sauce")
                ),
                new Recipe(
                        2,
                        "Pasta Carbonara",
                        "you love it ~",
                        List.of("not fresh pasta, eggs, pecorino, guanciale, black pepper")
                )
        );
    }

}
