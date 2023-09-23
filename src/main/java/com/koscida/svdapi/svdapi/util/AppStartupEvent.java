package com.koscida.svdapi.svdapi.util;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.koscida.svdapi.svdapi.business.RecipeService;
import com.koscida.svdapi.svdapi.business.SkillService;
import com.koscida.svdapi.svdapi.business.SkillTree;
import com.koscida.svdapi.svdapi.business.VillagerService;
import com.koscida.svdapi.svdapi.data.Profession;
import com.koscida.svdapi.svdapi.data.Recipe;
import com.koscida.svdapi.svdapi.data.RecipeCategory;
import com.koscida.svdapi.svdapi.data.Skill;
import com.koscida.svdapi.svdapi.data.Villager;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

	private final VillagerService villagerService;
	private final SkillService skillService;
	private final RecipeService recipeService;

	public AppStartupEvent(VillagerService villagerService, SkillService skillService, RecipeService recipeService) {
		this.villagerService = villagerService;
		this.skillService = skillService;
		this.recipeService = recipeService;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

		//
		// get villagers
		List<Villager> villagers = this.villagerService.getVillagers();
		villagers.forEach(System.out::println);

		//
		// get skills
		List<Skill> skills = this.skillService.getSkills();
		skills.forEach(System.out::println);

		// get professions
		List<Profession> professions = this.skillService.getProfessions();
		professions.forEach(System.out::println);

		// get skill tree
		List<SkillTree> skillTree = this.skillService.getSkillTree();
		skillTree.forEach(System.out::println);

		//
		// get recipe categories
		List<RecipeCategory> recipeCategories = this.recipeService.getRecipeCategories();
		recipeCategories.forEach(System.out::println);

		// get recipes
		List<Recipe> recipes = this.recipeService.getRecipes();
		recipes.forEach(System.out::println);
	}

}
