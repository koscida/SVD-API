package com.koscida.svdapi.svdapi.data.tools;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOOL_TYPES")
public class ToolType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tool_type_id")
	private Long toolTypeId;

	@Column(name = "name")
	private String name;

	public Long getToolTypeId() {
		return this.toolTypeId;
	}

	public void setToolTypeId(Long toolTypeId) {
		this.toolTypeId = toolTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
