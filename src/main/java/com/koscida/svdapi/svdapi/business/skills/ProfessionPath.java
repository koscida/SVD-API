package com.koscida.svdapi.svdapi.business.skills;

import java.util.List;

import com.koscida.svdapi.svdapi.data.skills.Profession;

public class ProfessionPath {

	private Profession profession;
	private List<Profession> professionPath;

	public Profession getProfession() {
		return this.profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public List<Profession> getProfessionPath() {
		return this.professionPath;
	}

	public void setProfessionPath(List<Profession> professionPath) {
		this.professionPath = professionPath;
	}

	@Override
	public String toString() {
		return "ProfessionPath: {" +
				" profession: " + profession +
				" professionPath: " + professionPath.toString() +
				"}";
	}

}
