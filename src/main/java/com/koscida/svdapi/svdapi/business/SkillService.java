package com.koscida.svdapi.svdapi.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.koscida.svdapi.svdapi.data.Skill;
import com.koscida.svdapi.svdapi.data.SkillRepository;

@Service
public class SkillService {

	private final SkillRepository skillRepository;

	public SkillService(SkillRepository skillRepository) {
		this.skillRepository = skillRepository;
	}

	@GetMapping("/skills")
	public List<Skill> getSkills() {
		Iterable<Skill> skills = this.skillRepository.findAll();

		List<Skill> skillsList = new ArrayList<>();

		skills.forEach(skill -> {
			skillsList.add(skill);
		});

		return skillsList;
	}

}
