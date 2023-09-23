package com.koscida.svdapi.svdapi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koscida.svdapi.svdapi.data.Recipe;
import com.koscida.svdapi.svdapi.data.RecipeCategory;
import com.koscida.svdapi.svdapi.data.RecipeCategoryRepository;
import com.koscida.svdapi.svdapi.data.RecipeRepository;

@Service
public class RecipeService {

	private final RecipeCategoryRepository recipeCategoryRepository;
	private final RecipeRepository recipeRepository;

	public RecipeService(RecipeCategoryRepository recipeCategoryRepository, RecipeRepository recipeRepository) {
		this.recipeCategoryRepository = recipeCategoryRepository;
		this.recipeRepository = recipeRepository;
	}

	public List<RecipeCategory> getRecipeCategories() {
		return this.recipeCategoryRepository.findAll();
	}

	public List<Recipe> getRecipes() {
		return this.recipeRepository.findAll();
	}

}
