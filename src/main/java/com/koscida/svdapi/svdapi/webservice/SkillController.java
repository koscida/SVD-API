package com.koscida.svdapi.svdapi.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.SkillService;
import com.koscida.svdapi.svdapi.business.SkillTree;
import com.koscida.svdapi.svdapi.business.VillagerService;
import com.koscida.svdapi.svdapi.data.Profession;
import com.koscida.svdapi.svdapi.data.Skill;

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

	@GetMapping("/professions")
	public List<Profession> getProfessions() {
		return this.skillService.getProfessions();
	}

	@GetMapping("/tree")
	public List<SkillTree> getSkillTree() {
		return this.skillService.getSkillTree();
	}

}
