package io.connectedhealth.datasynthesis.apis;
// Entities and Repository Imports
import io.connectedhealth.datasynthesis.entities.*;
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
    private PlatformGenerationTypesRepository dataDataGenTypesRepository;
    @Autowired
    private PlatformDataAttributesRepository platformDataAttributesRepository;
    @Autowired
    private PlatformDataStructuresRepository platformDataStructuresRepository;

    // get all datagentypes
    @GetMapping("/datageneration")
    public List<PlatformDataGenerationEntity> getAllDataGenTypes(){
        return dataDataGenTypesRepository.findAll();
    }

    // get datagentypes by like names
    @GetMapping("/datageneration/desc/{datagentypedesc}")
    public List<PlatformDataGenerationEntity> getDataGenTypesLike(@PathVariable String datagentypedesc){
        return dataDataGenTypesRepository.findByDataGenTypeDescriptionContainingIgnoreCase(datagentypedesc);
    }
    // get all platform data attributes
    @GetMapping("/platformdataattributes")
    public List<PlatformDataAttributesEntity> getAllPlatformDataAttributes(){
        return platformDataAttributesRepository.findAll();
    }

    // get platform data attributes by like names
    @GetMapping("/platformdataattributes/desc/{datatypedesc}")
    public List<PlatformDataAttributesEntity> getDataAttributesTypesLike(@PathVariable String datatypedesc){
        return platformDataAttributesRepository.findByDataAttributeNameContainingIgnoreCase(datatypedesc);
    }

    // get all platform data attributes
    @GetMapping("/platformdatastructures")
    public List<PlatformDataStructuresEntity> getAllPlatformDataStructures(){
        return platformDataStructuresRepository.findAll();
    }
}
