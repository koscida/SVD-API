package com.koscida.svdapi.svdapi.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.recipes.RecipeService;
import com.koscida.svdapi.svdapi.data.recipes.Recipe;
import com.koscida.svdapi.svdapi.data.recipes.RecipeCategory;

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
		if (recipeIdString == null) {
			return this.getRecipes();
		} else {
			List<Recipe> recipeList = new ArrayList<>();
			recipeList.add(this.recipeService.getRecipeById(Long.parseLong(recipeIdString)));
			return recipeList;
		}

	}

	@GetMapping("/categories")
	public List<RecipeCategory> getRecipeCategories() {
		return recipeService.getRecipeCategories();
	}

	@GetMapping("/categories/")
	public List<RecipeCategory> getRecipecategoryById(
			@RequestParam(value = "id", required = false) String recipeCategoryIdString) {
		if (recipeCategoryIdString == null) {
			return this.getRecipeCategories();
		} else {
			List<RecipeCategory> recipeCategoryList = new ArrayList<>();
			recipeCategoryList.add(this.recipeService.getRecipeCategoryById(Long.valueOf(recipeCategoryIdString)));
			return recipeCategoryList;
		}
	}

}
