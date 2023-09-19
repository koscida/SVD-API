package com.koscida.svdapi.svdapi.business;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.koscida.svdapi.svdapi.data.Villager;
import com.koscida.svdapi.svdapi.data.VillagerRepository;

@Service
public class VillagerService {
	private final VillagerRepository villagerRepository;

	public VillagerService(VillagerRepository villagerRepository) {
		this.villagerRepository = villagerRepository;
	}

	public List<Villager> getVillagers() {
		Iterable<Villager> villagers = this.villagerRepository.findAll();

		List<Villager> villagersList = new ArrayList<>();

		villagers.forEach(villager -> {
			villagersList.add(villager);
		});

		return villagersList;
	}

}
