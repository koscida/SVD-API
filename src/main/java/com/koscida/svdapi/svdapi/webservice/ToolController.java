package com.koscida.svdapi.svdapi.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.tools.ToolService;
import com.koscida.svdapi.svdapi.data.tools.Tool;
import com.koscida.svdapi.svdapi.data.tools.ToolCategory;
import com.koscida.svdapi.svdapi.data.tools.ToolQualityType;
import com.koscida.svdapi.svdapi.data.tools.ToolType;

@RestController
@RequestMapping("/api/tools")
public class ToolController {

	ToolService toolService;

	public ToolController(ToolService toolService) {
		this.toolService = toolService;
	}

	// ////
	// tools
	@GetMapping("")
	public List<Tool> getTools() {
		return this.toolService.getTools();
	}

	@GetMapping("/")
	public List<Tool> getToolById(@RequestParam(name = "id", required = false) String toolId) {
		if(toolId == null) {
			return this.getTools();
		} else {
			List<Tool> toolList = new ArrayList<>();
			toolList.add(this.toolService.getToolById(Long.valueOf(toolId)));
			return toolList;
		}
	}

	// ////
	// tool types
	@GetMapping("/types")
	public List<ToolType> getToolTypes() {
		return this.toolService.getToolTypes();
	}

	@GetMapping("/types/")
	public List<ToolType> getToolTypeById(@RequestParam(name = "id", required = false) String toolTypeId) {
		if (toolTypeId == null) {
			return this.getToolTypes();
		} else {
			List<ToolType> toolList = new ArrayList<>();
			toolList.add(this.toolService.getToolTypeById(Long.valueOf(toolTypeId)));
			return toolList;
		}
	}

	// ////
	// tool categories
	@GetMapping("/categories")
	public List<ToolCategory> getToolCategories() {
		return this.toolService.getToolCategories();
	}

	@GetMapping("/categories/")
	public List<ToolCategory> getToolCategoryById(@RequestParam(name = "id", required = false) String toolCategoryId) {
		if (toolCategoryId == null) {
			return this.getToolCategories();
		} else {
			List<ToolCategory> toolList = new ArrayList<>();
			toolList.add(this.toolService.getToolCategoryById(Long.valueOf(toolCategoryId)));
			return toolList;
		}
	}

	// ////
	// tool quality types
	@GetMapping("/qualityTypes")
	public List<ToolQualityType> getToolQualityTypes() {
		return this.toolService.getToolQualityTypes();
	}

	@GetMapping("/qualityTypes/")
	public List<ToolQualityType> getToolQualityTypeById(
			@RequestParam(name = "id", required = false) String toolQualityTypeId) {
		if (toolQualityTypeId == null) {
			return this.getToolQualityTypes();
		} else {
			List<ToolQualityType> toolList = new ArrayList<>();
			toolList.add(this.toolService.getToolQualityTypeById(Long.valueOf(toolQualityTypeId)));
			return toolList;
		}
	}

}
