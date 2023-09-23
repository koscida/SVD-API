package com.koscida.svdapi.svdapi.business;

import java.util.List;

import com.koscida.svdapi.svdapi.data.Profession;

public class SkillTree {

	private long skillId;
	private String skillName;

	private List<ProfessionPath> professionPath;

	// getters and setters

	public long getSkillId() {
		return this.skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
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
				" skillId: " + skillId +
				" skillName: " + skillName +
				" professionPath: " + professionPath.toString() +
				"}";
	}
}
