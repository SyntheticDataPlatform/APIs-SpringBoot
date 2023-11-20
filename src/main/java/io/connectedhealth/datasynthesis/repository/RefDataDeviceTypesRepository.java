package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.RefDataDeviceTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefDataDeviceTypesRepository extends JpaRepository<RefDataDeviceTypesEntity, Long> {

    List<RefDataDeviceTypesEntity> findByDeviceTypeContainingIgnoreCase(String devicetype);

}
