package com.koscida.svdapi.svdapi.business.skills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.koscida.svdapi.svdapi.data.skills.Profession;
import com.koscida.svdapi.svdapi.data.skills.ProfessionRepository;
import com.koscida.svdapi.svdapi.data.skills.Skill;
import com.koscida.svdapi.svdapi.data.skills.SkillBuff;
import com.koscida.svdapi.svdapi.data.skills.SkillBuffsRepository;
import com.koscida.svdapi.svdapi.data.skills.SkillRepository;

@Service
public class SkillService {

	private final SkillRepository skillRepository;
	private final ProfessionRepository professionRepository;
	private final SkillBuffsRepository skillBuffsRepository;

	public SkillService(SkillRepository skillRepository, ProfessionRepository professionRepository,
			SkillBuffsRepository skillBuffsRepository) {
		this.skillRepository = skillRepository;
		this.professionRepository = professionRepository;
		this.skillBuffsRepository = skillBuffsRepository;
	}

	// ////
	// Skills

	public List<Skill> getSkills() {
		Iterable<Skill> skills = this.skillRepository.findAll();

		List<Skill> skillsList = new ArrayList<>();

		skills.forEach(skill -> {
			skillsList.add(skill);
		});

		return skillsList;
	}

	public Skill getSkillById(Long skillId) {
		Optional<Skill> skillOptional = this.skillRepository.findById(skillId);
		Skill result = skillOptional.orElse(null);
		return result;
	}

	// ////
	// Professions

	public List<Profession> getProfessions() {
		Iterable<Profession> professions = this.professionRepository.findAll();

		List<Profession> professionList = new ArrayList<>();

		professions.forEach(profession -> {
			professionList.add(profession);
		});

		return professionList;
	}

	public Profession getProfessionById(Long professionId) {
		Optional<Profession> professionOptional = this.professionRepository.findById(professionId);
		Profession result = professionOptional.orElse(null);
		return result;
	}

	// ////
	// Skill Tree

	private List<SkillTree> buildSkillTreeForSkillList(Iterable<Skill> skills) {
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

		return skillTree;
	}

	public List<SkillTree> getSkillTree() {
		// get all skills
		Iterable<Skill> skills = this.skillRepository.findAll();

		// return
		return this.buildSkillTreeForSkillList(skills);
	}

	public SkillTree getSkillTreeBySkillId(Long skillId) {
		// get all skills
		Optional<Skill> skillOptional = this.skillRepository.findById(skillId);

		List<Skill> skillList = new ArrayList<>();
		skillList.add(skillOptional.orElse(null));

		// return
		return this.buildSkillTreeForSkillList(skillList).get(0);
	}

	// ////
	// Skill Buffs

	public List<SkillBuff> getSkillBuffs() {
		return this.skillBuffsRepository.findAll();
	}

	public SkillBuff getSkillBuffById(Long skillBuffId) {
		Optional<SkillBuff> skillBuffOptional = this.skillBuffsRepository.findById(skillBuffId);
		return skillBuffOptional.orElse(null);
	}

}
