package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.DataGeneratedDevicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DataGeneratedDevicesRepository extends JpaRepository<DataGeneratedDevicesEntity, Long> {

    List<DataGeneratedDevicesEntity> findByDeviceNameContainingIgnoreCase(String accountnumbervalue);

}
