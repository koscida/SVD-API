package com.koscida.svdapi.svdapi.util;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.koscida.svdapi.svdapi.business.VillagerService;
import com.koscida.svdapi.svdapi.data.Villager;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
	private final VillagerService villagerService;

	public AppStartupEvent(VillagerService villagerService) {
		this.villagerService = villagerService;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		List<Villager> villagers = this.villagerService.getVillagers();
		villagers.forEach(System.out::println);
	}

}
