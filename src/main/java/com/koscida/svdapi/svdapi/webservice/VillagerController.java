package com.koscida.svdapi.svdapi.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koscida.svdapi.svdapi.business.villagers.VillagerService;
import com.koscida.svdapi.svdapi.data.villagers.Villager;

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

	@GetMapping("/")
	public List<Villager> getVillagersById(@RequestParam(name = "id", required = false) String villagerIdString) {
		if (villagerIdString == null) {
			return this.getVillagers();
		} else {
			List<Villager> villagerList = new ArrayList<>();
			villagerList.add(this.villagerService.getVillagerbyId(Long.valueOf(villagerIdString)));
			return villagerList;
		}
	}
}
