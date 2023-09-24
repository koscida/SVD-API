package com.koscida.svdapi.svdapi.data.recipes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recipe_id")
	Long recipeId;

	@Column(name = "name")
	String name;

	@OneToOne()
	@JoinColumn(name = "recipe_category_id")
	RecipeCategory recipeCategory;

	public Long getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RecipeCategory getRecipeCategory() {
		return this.recipeCategory;
	}

	public void setRecipeCategory(RecipeCategory recipeCategory) {
		this.recipeCategory = recipeCategory;
	}

	@Override
	public String toString() {
		return "Recipe { " +
				" name: " + name +
				" recipeCategory: " + recipeCategory.toString() +
				"}";
	}

}
