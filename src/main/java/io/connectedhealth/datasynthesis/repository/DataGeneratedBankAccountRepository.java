package io.connectedhealth.datasynthesis.repository;

import io.connectedhealth.datasynthesis.entities.DataGeneratedBankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DataGeneratedBankAccountRepository extends JpaRepository<DataGeneratedBankAccountEntity, Long> {

    List<DataGeneratedBankAccountEntity> findByBankAccountValueContainingIgnoreCase(String bankaccountnumbervalue);

}
