package com.koscida.svdapi.svdapi.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.VillagerService;
import com.koscida.svdapi.svdapi.data.Villager;

@RestController
@RequestMapping("/api/villagers")
public class VillagerController {

	private final VillagerService villagerService;

	public VillagerController(VillagerService villagerService) {
		this.villagerService = villagerService;
	}

	@GetMapping("")
	public List<Villager> getVillagers() {
		return this.villagerService.getVillagers();
	}
}
