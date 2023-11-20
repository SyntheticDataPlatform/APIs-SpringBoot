package io.connectedhealth.datasynthesis.apis;

import io.connectedhealth.datasynthesis.entities.DataExistingProfessionsEntity;
import io.connectedhealth.datasynthesis.repository.DataExistingProfessionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProfessionsController {

    @Autowired
    private DataExistingProfessionsRepository professionsRepository;

    // get all employees
    @GetMapping("/professions")
    public List<DataExistingProfessionsEntity> getAllProfessions(){
        return professionsRepository.findAll();
    }

    // get abanks by like names
    @GetMapping("/professions/name/{professionName}")
    public List<DataExistingProfessionsEntity> getProfessionsNamesLike(@PathVariable String professionName){
        return professionsRepository.findByProfessionNameContainingIgnoreCase(professionName);
    }

}
