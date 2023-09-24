package com.koscida.svdapi.svdapi.business.villagers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.koscida.svdapi.svdapi.data.villagers.Villager;
import com.koscida.svdapi.svdapi.data.villagers.VillagerRepository;

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

	public Villager getVillagerbyId(Long villagerId) {
		Optional<Villager> villagerOptional = this.villagerRepository.findById(villagerId);
		Villager result = villagerOptional.orElse(null);
		return result;
	}

}
