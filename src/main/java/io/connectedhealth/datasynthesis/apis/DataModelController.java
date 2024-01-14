package io.connectedhealth.datasynthesis.apis;

import io.connectedhealth.datasynthesis.entities.*;
import io.connectedhealth.datasynthesis.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataModelController {

    @Autowired
    private DataModelDataDomainsRepository dataModelDataDomainsRepository;
    @Autowired
    private DataModelDataTablesRepository dataModelDataTablesRepository;

    // get all platform data attributes
    @GetMapping("/datamodeldatadomains")
    public List<DataModelDataDomainsEntity> getAllDataDomains(){
        return dataModelDataDomainsRepository.findAll();
    }

    // get datagentypes by like names
    @GetMapping("/datamodeldatadomains/desc/{datamodeldesc}")
    public List<DataModelDataDomainsEntity> getDataModelDataLike(@PathVariable String datamodeldesc){
        return dataModelDataDomainsRepository.findByDomainInformationContainingIgnoreCase(datamodeldesc);
    }
    // get all platform data attributes
    @GetMapping("/datamodeldatatables")
    public List<DataModelDataTablesEntity> getAllPlatformAppSettings(){
        return dataModelDataTablesRepository.findAll();
    }

    // get datagentypes by like names
    @GetMapping("/datamodeldatatables/desc/{datamodeldesc}")
    public List<DataModelDataTablesEntity> getDataGenTypesLike(@PathVariable String datamodeldesc){
        return dataModelDataTablesRepository.findByTableNameContainsIgnoreCase(datamodeldesc);
    }


}
