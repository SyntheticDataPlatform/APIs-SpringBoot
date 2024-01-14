package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.PlatformDataGenerationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatformGenerationTypesRepository extends JpaRepository<PlatformDataGenerationEntity, Long> {

    List<PlatformDataGenerationEntity> findByDataGenTypeDescriptionContainingIgnoreCase(String appdesccode);

}
