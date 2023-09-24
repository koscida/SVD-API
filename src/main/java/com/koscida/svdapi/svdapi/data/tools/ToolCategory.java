package com.koscida.svdapi.svdapi.data.tools;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOOL_CATEGORIES")
public class ToolCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tool_category_id")
	private Long toolCategoryId;

	@Column(name = "name")
	private String name;

	public Long getToolCategoryId() {
		return this.toolCategoryId;
	}

	public void setToolCategoryId(Long toolCategoryId) {
		this.toolCategoryId = toolCategoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
