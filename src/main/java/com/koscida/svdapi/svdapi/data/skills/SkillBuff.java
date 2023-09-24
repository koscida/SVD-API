package com.koscida.svdapi.svdapi.data.skills;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SKILL_BUFFS")
public class SkillBuff {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skill_buff_id")
	Long id;

	@Column(name = "name")
	String name;

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
		return "SkillBuffs {" +
				" id: " + id +
				" name: " + name +
				"}";
	}

}
