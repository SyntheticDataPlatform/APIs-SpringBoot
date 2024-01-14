package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.PlatformDataStructuresEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PlatformDataStructuresRepository extends JpaRepository<PlatformDataStructuresEntity, Long> {

    List<PlatformDataStructuresEntity> findByDataStructureNameContainsIgnoreCase(String codeDesc);

}
