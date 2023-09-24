package com.koscida.svdapi.svdapi.business.recipes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.koscida.svdapi.svdapi.data.recipes.Recipe;
import com.koscida.svdapi.svdapi.data.recipes.RecipeCategory;
import com.koscida.svdapi.svdapi.data.recipes.RecipeCategoryRepository;
import com.koscida.svdapi.svdapi.data.recipes.RecipeRepository;

@Service
public class RecipeService {

	private final RecipeCategoryRepository recipeCategoryRepository;
	private final RecipeRepository recipeRepository;

	public RecipeService(RecipeCategoryRepository recipeCategoryRepository, RecipeRepository recipeRepository) {
		this.recipeCategoryRepository = recipeCategoryRepository;
		this.recipeRepository = recipeRepository;
	}

	public List<Recipe> getRecipes() {
		return this.recipeRepository.findAll();
	}

	public Recipe getRecipeById(Long recipeId) {
		Optional<Recipe> recipeOptional = this.recipeRepository.findById(recipeId);
		Recipe result = recipeOptional.orElse(null);
		return result;
	}

	public List<RecipeCategory> getRecipeCategories() {
		return this.recipeCategoryRepository.findAll();
	}

	public RecipeCategory getRecipeCategoryById(Long recipeCategoryId) {
		Optional<RecipeCategory> recipeCategoryOptional = this.recipeCategoryRepository.findById(recipeCategoryId);
		RecipeCategory result = recipeCategoryOptional.orElse(null);
		return result;
	}

}
