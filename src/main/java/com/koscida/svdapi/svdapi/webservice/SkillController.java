package com.koscida.svdapi.svdapi.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.skills.SkillService;
import com.koscida.svdapi.svdapi.business.skills.SkillTree;
import com.koscida.svdapi.svdapi.business.villagers.VillagerService;
import com.koscida.svdapi.svdapi.data.skills.Profession;
import com.koscida.svdapi.svdapi.data.skills.Skill;
import com.koscida.svdapi.svdapi.data.skills.SkillBuff;

@RequestMapping("/api/skills")
@RestController
public class SkillController {

	private final SkillService skillService;

	public SkillController(SkillService skillService) {
		this.skillService = skillService;
	}

	@GetMapping("")
	public List<Skill> getSkills() {
		return this.skillService.getSkills();
	}

	@GetMapping("/")
	public List<Skill> getSkillById(@RequestParam(name = "id", required = false) String skillIdString) {
		if (skillIdString == null) {
			return this.getSkills();
		} else {
			List<Skill> skillList = new ArrayList<>();
			skillList.add(this.skillService.getSkillById(Long.valueOf(skillIdString)));
			return skillList;
		}
	}

	@GetMapping("/professions")
	public List<Profession> getProfessions() {
		return this.skillService.getProfessions();
	}

	@GetMapping("/professions/")
	public List<Profession> getProfessionById(@RequestParam(name = "id", required = false) String professionIdString) {
		if (professionIdString == null) {
			return this.getProfessions();
		} else {
			List<Profession> professionsList = new ArrayList<>();
			professionsList.add(this.skillService.getProfessionById(Long.valueOf(professionIdString)));
			return professionsList;
		}
	}

	@GetMapping("/tree")
	public List<SkillTree> getSkillTree() {
		return this.skillService.getSkillTree();
	}

	@GetMapping("/tree/")
	public List<SkillTree> getSkillTreeById(@RequestParam(name = "id", required = false) String skillIdString) {
		if (skillIdString == null) {
			return this.getSkillTree();
		} else {
			List<SkillTree> skillTreeList = new ArrayList<>();
			skillTreeList.add(this.skillService.getSkillTreeBySkillId(Long.valueOf(skillIdString)));
			return skillTreeList;
		}
	}

	@GetMapping("/buffs")
	public List<SkillBuff> getSkillBuffs() {
		return this.skillService.getSkillBuffs();
	}

	@GetMapping("/buffs/")
	public List<SkillBuff> getSkillBuffById(@RequestParam(name = "id", required = false) String skillBuffId) {
		if (skillBuffId == null) {
			return this.getSkillBuffs();
		} else {
			List<SkillBuff> skillBuffsList = new ArrayList<>();
			skillBuffsList.add(this.skillService.getSkillBuffById(Long.valueOf(skillBuffId)));
			return skillBuffsList;
		}
	}

}
