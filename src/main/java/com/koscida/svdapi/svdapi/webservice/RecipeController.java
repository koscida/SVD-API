package com.koscida.svdapi.svdapi.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.RecipeService;
import com.koscida.svdapi.svdapi.data.Recipe;
import com.koscida.svdapi.svdapi.data.RecipeCategory;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

	RecipeService recipeService;

	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@GetMapping("")
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();
	}

	@GetMapping("/")
	public List<Recipe> getRecipeById(@RequestParam(value = "id", required = false) String recipeIdString) {
		System.out.println("recipeIdString: " + recipeIdString);
		if (recipeIdString == null) {
			return this.getRecipes();
		} else {
			Long recipeId = Long.parseLong(recipeIdString);
			return recipeService.getRecipeById(recipeId);
		}

	}

	@GetMapping("/categories")
	public List<RecipeCategory> getRecipeCategories() {
		return recipeService.getRecipeCategories();
	}

}
