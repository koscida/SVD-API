package com.koscida.svdapi.svdapi.data.villagers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillagerRepository extends JpaRepository<Villager, Long> {

}
