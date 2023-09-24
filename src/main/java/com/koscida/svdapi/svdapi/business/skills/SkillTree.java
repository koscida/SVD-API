package com.koscida.svdapi.svdapi.business.skills;

import java.util.List;

import com.koscida.svdapi.svdapi.data.skills.Profession;
import com.koscida.svdapi.svdapi.data.skills.Skill;

public class SkillTree {

	private Skill skill;
	private List<ProfessionPath> professionPath;

	// getters and setters

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public List<ProfessionPath> getProfessionPath() {
		return this.professionPath;
	}

	public void setProfessionPath(List<ProfessionPath> professionPath) {
		this.professionPath = professionPath;
	}

	@Override
	public String toString() {
		return "SkillTree: {" +
				" skill: " + skill.toString() +
				" professionPath: " + professionPath.toString() +
				"}";
	}
}
