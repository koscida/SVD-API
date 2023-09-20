package com.koscida.svdapi.svdapi.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SKILLS")
public class Skill {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SKILL_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	// getters and setters

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill: {" +
				" name: " + getName() +
				"}";
	}

}
