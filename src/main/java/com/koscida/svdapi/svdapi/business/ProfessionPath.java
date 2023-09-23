package com.koscida.svdapi.svdapi.business;

import java.util.List;

import com.koscida.svdapi.svdapi.data.Profession;

public class ProfessionPath {

	private Profession profession;
	private List<Profession> professions;

	public Profession getProfession() {
		return this.profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public List<Profession> getProfessions() {
		return this.professions;
	}

	public void setProfessions(List<Profession> professions) {
		this.professions = professions;
	}

	@Override
	public String toString() {
		return "ProfessionPath: {" +
				" profession: " + profession +
				" professions: " + professions.toString() +
				"}";
	}

}
