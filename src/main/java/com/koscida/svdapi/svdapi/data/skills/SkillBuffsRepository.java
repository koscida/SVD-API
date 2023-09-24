package com.koscida.svdapi.svdapi.data.skills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillBuffsRepository extends JpaRepository<SkillBuff, Long> {

}
