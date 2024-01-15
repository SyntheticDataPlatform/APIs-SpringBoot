package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.DataTierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DataTierRepository extends JpaRepository<DataTierEntity, Long> {

    List<DataTierEntity> findByDataAttributeIdEquals(Long dataattributeId);
    List<DataTierEntity> findByDataGenTypeIdEquals(Long datatypegenId);
    List<DataTierEntity> findByBaseValueContainingIgnoreCase(String basesearch);
    List<DataTierEntity> findBySupportingValue1ContainingIgnoreCase(String support1search);
    List<DataTierEntity> findBySupportingValue2ContainingIgnoreCase(String support2search);
    List<DataTierEntity> findBySupportingValue3ContainingIgnoreCase(String support3search);
    List<DataTierEntity> findBySupportingValue4ContainingIgnoreCase(String support4search);
    //List<DataTierEntity> findByDataAttributeIdEqualsAndDataGenTypeIdEqualsAndBaseValueContainsIgnoreCaseAndSupportingValue1ContainsIgnoreCase(Long dataattributeId,Long datatypegenId,String basesearch,String support1search);
    List<DataTierEntity> findByDataAttributeIdEqualsAndBaseValueContainsIgnoreCase(Long dataattributeId,String basesearch);
    List<DataTierEntity> findByDataAttributeIdEqualsAndBaseValueContainsIgnoreCaseAndSupportingValue1ContainsIgnoreCase(Long dataattributeId, String basesearch, String support1search);
}
