package com.koscida.svdapi.svdapi.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/categories")
	public List<RecipeCategory> getRecipeCategories() {
		return recipeService.getRecipeCategories();
	}

	@RequestMapping("")
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();
	}

	@RequestMapping("/")
	public List<Recipe> getRecipesDup() {
		return this.getRecipes();
	}

}
