package com.koscida.svdapi.svdapi.data.skills;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Long> {

	public List<Profession> findBySkillId(Long skillId);
	// public List<Profession> findBySkill(Skill skill);

	public List<Profession> findBySkillIdAndLevel(Long skillId, int level);
	// public List<Profession> findBySkillAndLevel(Skill skill, int level);

	public List<Profession> findByProfessionPathId(long professionPathId);
	// public List<Profession> findByProfessionPath(Profession professionPath);

}
