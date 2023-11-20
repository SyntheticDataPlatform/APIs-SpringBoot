package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.DataExistingProfessionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DataExistingProfessionsRepository extends JpaRepository<DataExistingProfessionsEntity, Long> {

    List<DataExistingProfessionsEntity> findByProfessionNameContainingIgnoreCase(String name);
}
