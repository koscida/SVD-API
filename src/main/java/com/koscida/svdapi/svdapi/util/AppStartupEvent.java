package com.koscida.svdapi.svdapi.util;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.koscida.svdapi.svdapi.business.recipes.RecipeService;
import com.koscida.svdapi.svdapi.business.skills.SkillService;
import com.koscida.svdapi.svdapi.business.skills.SkillTree;
import com.koscida.svdapi.svdapi.business.tools.ToolService;
import com.koscida.svdapi.svdapi.business.villagers.VillagerService;
import com.koscida.svdapi.svdapi.data.recipes.Recipe;
import com.koscida.svdapi.svdapi.data.recipes.RecipeCategory;
import com.koscida.svdapi.svdapi.data.skills.Profession;
import com.koscida.svdapi.svdapi.data.skills.Skill;
import com.koscida.svdapi.svdapi.data.skills.SkillBuff;
import com.koscida.svdapi.svdapi.data.tools.Tool;
import com.koscida.svdapi.svdapi.data.tools.ToolCategory;
import com.koscida.svdapi.svdapi.data.tools.ToolQualityType;
import com.koscida.svdapi.svdapi.data.tools.ToolType;
import com.koscida.svdapi.svdapi.data.villagers.Villager;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

	private final VillagerService villagerService;
	private final SkillService skillService;
	private final RecipeService recipeService;
	private final ToolService toolService;

	public AppStartupEvent(VillagerService villagerService, SkillService skillService, RecipeService recipeService,
			ToolService toolService) {
		this.villagerService = villagerService;
		this.skillService = skillService;
		this.recipeService = recipeService;
		this.toolService = toolService;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

		// ////
		// villagers

		// get villagers
		List<Villager> villagers = this.villagerService.getVillagers();
		villagers.forEach(System.out::println);

		// ////
		// skills

		// get skills
		List<Skill> skills = this.skillService.getSkills();
		skills.forEach(System.out::println);

		// get professions
		List<Profession> professions = this.skillService.getProfessions();
		professions.forEach(System.out::println);

		// get skill tree
		List<SkillTree> skillTree = this.skillService.getSkillTree();
		skillTree.forEach(System.out::println);

		// get skill buffs
		List<SkillBuff> skillBuffs = this.skillService.getSkillBuffs();
		skillBuffs.forEach(System.out::println);

		// ////
		// recipes

		// get recipe categories
		List<RecipeCategory> recipeCategories = this.recipeService.getRecipeCategories();
		recipeCategories.forEach(System.out::println);

		// get recipes
		List<Recipe> recipes = this.recipeService.getRecipes();
		recipes.forEach(System.out::println);

		// ////
		// tools

		// get tool types
		List<ToolType> toolTypes = this.toolService.getToolTypes();
		toolTypes.forEach(System.out::println);

		// get tool categories
		List<ToolCategory> toolCategories = this.toolService.getToolCategories();
		toolCategories.forEach(System.out::println);

		// get tool quality types
		List<ToolQualityType> toolQualityTypes = this.toolService.getToolQualityTypes();
		toolQualityTypes.forEach(System.out::println);

		// get tools
		List<Tool> tools = this.toolService.getTools();
		tools.forEach(System.out::println);
	}

}
