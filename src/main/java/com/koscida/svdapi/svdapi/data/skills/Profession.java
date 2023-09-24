package com.koscida.svdapi.svdapi.data.skills;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
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

	@OneToOne
	@JoinColumn(name = "SKILL_ID")
	private Skill skill;

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

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
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
				" name: " + name +
				" level: " + level +
				" skill: " + skill.toString() +
				" profession_path_id: " + professionPathId +
				"}";

	}

}
