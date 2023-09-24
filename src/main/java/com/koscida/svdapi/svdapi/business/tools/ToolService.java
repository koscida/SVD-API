package com.koscida.svdapi.svdapi.business.tools;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.koscida.svdapi.svdapi.data.tools.Tool;
import com.koscida.svdapi.svdapi.data.tools.ToolCategory;
import com.koscida.svdapi.svdapi.data.tools.ToolCategoryRepository;
import com.koscida.svdapi.svdapi.data.tools.ToolQualityType;
import com.koscida.svdapi.svdapi.data.tools.ToolQualityTypeRepository;
import com.koscida.svdapi.svdapi.data.tools.ToolRepository;
import com.koscida.svdapi.svdapi.data.tools.ToolType;
import com.koscida.svdapi.svdapi.data.tools.ToolTypeRepository;

@Service
public class ToolService {

	ToolRepository toolRepository;
	ToolTypeRepository toolTypeRepository;
	ToolCategoryRepository toolCategoryRepository;
	ToolQualityTypeRepository toolQualityTypeRepository;

	public ToolService(ToolRepository toolRepository, ToolTypeRepository toolTypeRepository,
			ToolCategoryRepository toolCategoryRepository, ToolQualityTypeRepository toolQualityTypeRepository) {
		this.toolRepository = toolRepository;
		this.toolTypeRepository = toolTypeRepository;
		this.toolCategoryRepository = toolCategoryRepository;
		this.toolQualityTypeRepository = toolQualityTypeRepository;
	}

	// ////
	// tools
	public List<Tool> getTools() {

		return this.toolRepository.findAll();
	}

	public Tool getToolById(Long toolId) {
		Optional<Tool> toolOptional = this.toolRepository.findById(toolId);
		Tool result = toolOptional.orElse(null);
		return result;
	}

	// ////
	// tool types
	public List<ToolType> getToolTypes() {
		return this.toolTypeRepository.findAll();
	}

	public ToolType getToolTypeById(Long toolTypeId) {
		Optional<ToolType> toolTypeOptional = this.toolTypeRepository.findById(toolTypeId);
		ToolType result = toolTypeOptional.orElse(null);
		return result;
	}

	// ////
	// tool categories
	public List<ToolCategory> getToolCategories() {
		return this.toolCategoryRepository.findAll();
	}

	public ToolCategory getToolCategoryById(Long toolCategoryId) {
		Optional<ToolCategory> toolCategoriesOptional = this.toolCategoryRepository.findById(toolCategoryId);
		ToolCategory result = toolCategoriesOptional.orElse(null);
		return result;
	}

	// ////
	// tool quality types
	public List<ToolQualityType> getToolQualityTypes() {
		return this.toolQualityTypeRepository.findAll();
	}

	public ToolQualityType getToolQualityTypeById(Long toolQualityTypeId) {
		Optional<ToolQualityType> toolQualityTypeOptional = this.toolQualityTypeRepository.findById(toolQualityTypeId);
		ToolQualityType result = toolQualityTypeOptional.orElse(null);
		return result;
	}

}
