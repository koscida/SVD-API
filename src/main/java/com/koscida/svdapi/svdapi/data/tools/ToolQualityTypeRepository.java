package com.koscida.svdapi.svdapi.data.tools;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolQualityTypeRepository extends JpaRepository<ToolQualityType, Long> {

}
