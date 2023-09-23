package com.koscida.svdapi.svdapi.util;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.koscida.svdapi.svdapi.business.SkillService;
import com.koscida.svdapi.svdapi.business.SkillTree;
import com.koscida.svdapi.svdapi.business.VillagerService;
import com.koscida.svdapi.svdapi.data.Profession;
import com.koscida.svdapi.svdapi.data.Skill;
import com.koscida.svdapi.svdapi.data.Villager;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

	private final VillagerService villagerService;
	private final SkillService skillService;

	public AppStartupEvent(VillagerService villagerService, SkillService skillService) {
		this.villagerService = villagerService;
		this.skillService = skillService;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// get villagers
		List<Villager> villagers = this.villagerService.getVillagers();
		villagers.forEach(System.out::println);

		// get skills
		List<Skill> skills = this.skillService.getSkills();
		skills.forEach(System.out::println);

		// get professions
		List<Profession> professions = this.skillService.getProfessions();
		professions.forEach(System.out::println);

		// get skill tree
		List<SkillTree> skillTree = this.skillService.getSkillTree();
		skillTree.forEach(System.out::println);
	}

}
