package com.koscida.svdapi.svdapi.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.SkillService;
import com.koscida.svdapi.svdapi.data.Skill;

@RestController

ublic class SkillController {

	
	public SkillController(SkillService skillService) {
		this.skillService = skillService;
	}

	@GetMapping("/skills")
	public List<Skill> getSkills() {
		return this.skillService.getSkills();
	}

}
