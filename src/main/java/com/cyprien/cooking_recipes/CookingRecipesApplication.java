package com.cyprien.cooking_recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CookingRecipesApplication {

	public static void main(String[] args) {
        SpringApplication.run(CookingRecipesApplication.class, args);
	}

    @GetMapping
    public String helloWorld(){
        return "Hello world spring boot";
    }

}
