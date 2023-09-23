package com.koscida.svdapi.svdapi.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Long> {

	public List<Profession> findBySkillId(Long skillId);

	public List<Profession> findBySkillIdAndLevel(Long skillId, int level);

	public List<Profession> findByProfessionPathId(long professionPathId);

}
