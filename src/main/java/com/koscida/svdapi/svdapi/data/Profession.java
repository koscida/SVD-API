package com.koscida.svdapi.svdapi.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROFESSIONS")
public class Profession {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROFESSION_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LEVEL")
	private int level;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "SKILL_ID")
	private Long skillId;

	@Column(name = "PROFESSION_PATH_ID")
	private Long professionPathId;

	// getters and setters

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSkillId() {
		return this.skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Long getProfessionPathId() {
		return this.professionPathId;
	}

	public void setProfessionPathId(Long ProfessionPathId) {
		this.professionPathId = ProfessionPathId;
	}

	// to string
	@Override
	public String toString() {
		return "Profession: {" +
				" name: " + getName() +
				" level: " + getLevel() +
				" skill id: " + getSkillId() +
				" profession path id: " + getProfessionPathId() + "}";

	}

}
