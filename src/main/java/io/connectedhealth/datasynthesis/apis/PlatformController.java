package io.connectedhealth.datasynthesis.apis;
// Entities and Repository Imports
import io.connectedhealth.datasynthesis.entities.PlatformDataAttributesEntity;
import io.connectedhealth.datasynthesis.entities.RefDataDataGenTypesEntity;
import io.connectedhealth.datasynthesis.repository.*;
// General Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlatformController {
    @Autowired
    private RefDataDataGenTypesRepository dataDataGenTypesRepository;
    @Autowired
    private PlatformDataAttributesRepository platformDataAttributesRepository;

    // get all datagentypes
    @GetMapping("/datagentypes")
    public List<RefDataDataGenTypesEntity> getAllDataGenTypes(){
        return dataDataGenTypesRepository.findAll();
    }

    // get datagentypes by like names
    @GetMapping("/datagentypes/desc/{datagentypedesc}")
    public List<RefDataDataGenTypesEntity> getDataGenTypesLike(@PathVariable String datagentypedesc){
        return dataDataGenTypesRepository.findByDataGenTypeDescriptionContainingIgnoreCase(datagentypedesc);
    }
    // get all platform data attributes
    @GetMapping("/platformdataattributes")
    public List<PlatformDataAttributesEntity> getAllPlatformDataAttributes(){
        return platformDataAttributesRepository.findAll();
    }

    // get datagentypes by like names
    @GetMapping("/platformdataattributes/desc/{datatypedesc}")
    public List<PlatformDataAttributesEntity> getDataAttributesTypesLike(@PathVariable String datatypedesc){
        return platformDataAttributesRepository.findByDataAttributeNameContainingIgnoreCase(datatypedesc);
    }
}
