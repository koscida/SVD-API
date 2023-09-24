package com.koscida.svdapi.svdapi.data.tools;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOOLS")
public class Tool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tool_id")
	private Long toolId;

	@OneToOne
	@JoinColumn(name = "tool_type_id")
	private ToolType toolType;

	@OneToOne
	@JoinColumn(name = "tool_category_id")
	private ToolCategory toolCategory;

	@OneToOne
	@JoinColumn(name = "tool_quality_type_id")
	private ToolQualityType toolQualityType;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "is_starter")
	private Boolean isStarter;

	public Long getToolId() {
		return this.toolId;
	}

	public void setToolId(Long toolId) {
		this.toolId = toolId;
	}

	public ToolType getToolType() {
		return this.toolType;
	}

	public void setToolType(ToolType toolType) {
		this.toolType = toolType;
	}

	public ToolCategory getToolCategory() {
		return this.toolCategory;
	}

	public void setToolCategory(ToolCategory toolCategory) {
		this.toolCategory = toolCategory;
	}

	public ToolQualityType getToolQualityType() {
		return this.toolQualityType;
	}

	public void setToolQualityType(ToolQualityType toolQualityType) {
		this.toolQualityType = toolQualityType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isIsStarter() {
		return this.isStarter;
	}

	public Boolean getIsStarter() {
		return this.isStarter;
	}

	public void setIsStarter(Boolean isStarter) {
		this.isStarter = isStarter;
	}

}
