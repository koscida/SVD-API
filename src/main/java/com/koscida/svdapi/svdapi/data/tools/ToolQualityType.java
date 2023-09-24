package com.koscida.svdapi.svdapi.data.tools;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOOL_QUALITY_TYPES")
public class ToolQualityType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tool_quality_type_id")
	private Long toolQualityTypeId;

	@Column(name = "name")
	private String name;

	public Long getToolQualityTypeId() {
		return this.toolQualityTypeId;
	}

	public void setToolQualityTypeId(Long toolQualityTypeId) {
		this.toolQualityTypeId = toolQualityTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
