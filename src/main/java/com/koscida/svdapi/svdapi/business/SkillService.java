package com.koscida.svdapi.svdapi.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.koscida.svdapi.svdapi.data.Profession;
import com.koscida.svdapi.svdapi.data.ProfessionRepository;
import com.koscida.svdapi.svdapi.data.Skill;
import com.koscida.svdapi.svdapi.data.SkillRepository;

@Service
public class SkillService {

	private final SkillRepository skillRepository;
	private final ProfessionRepository professionRepository;

	public SkillService(SkillRepository skillRepository, ProfessionRepository professionRepository) {
		this.skillRepository = skillRepository;
		this.professionRepository = professionRepository;
	}

	public List<SkillTree> getSkillTree() {
		// get all skills
		Iterable<Skill> skills = this.skillRepository.findAll();

		// init skill tree
		List<SkillTree> skillTree = new ArrayList<>();

		// build tree
		skills.forEach(skill -> {
			// create a new skill tree
			SkillTree newSkillTreeSkill = new SkillTree();

			// set the skill info
			newSkillTreeSkill.setSkill(skill);

			//
			// set the skill's profession path
			List<ProfessionPath> professionPaths = new ArrayList<>();
			// get the first two level 5 professions
			List<Profession> professionsLevel5 = this.professionRepository.findBySkillIdAndLevel(skill.getId(), 5);
			// get the level 10 professions
			professionsLevel5.forEach(profession -> {
				// create the path
				ProfessionPath professionPath = new ProfessionPath();
				// set data
				professionPath.setProfession(profession);
				List<Profession> professionsLevel10 = this.professionRepository.findByProfessionPathId(
						profession.getId());
				professionPath.setProfessionPath(professionsLevel10);
				// add to paths
				professionPaths.add(professionPath);
			});
			// set to skill tree
			newSkillTreeSkill.setProfessionPath(professionPaths);

			// add skill tree to list
			skillTree.add(newSkillTreeSkill);
		});

		// return
		return skillTree;
	}

	public List<Skill> getSkills() {
		Iterable<Skill> skills = this.skillRepository.findAll();

		List<Skill> skillsList = new ArrayList<>();

		skills.forEach(skill -> {
			skillsList.add(skill);
		});

		return skillsList;
	}

	public List<Profession> getProfessions() {
		Iterable<Profession> professions = this.professionRepository.findAll();

		List<Profession> professionList = new ArrayList<>();

		professions.forEach(profession -> {
			professionList.add(profession);
		});

		return professionList;
	}

}
