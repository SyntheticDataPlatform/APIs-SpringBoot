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
public class DataTierController {
    @Autowired
    private DataTierRepository dataTierRepository;

    // get all data tier
    @GetMapping("/datatier")
    public List<DataTierEntity> getAllDataTier(){
        return dataTierRepository.findAll();
    }

    public List<DataTierEntity> getByDataAttributeIdAndBaseValueContains(@PathVariable Long dataattributeId,@PathVariable String basesearch)
    {
        return dataTierRepository.findByDataAttributeIdEqualsAndBaseValueContainsIgnoreCase(dataattributeId,basesearch);
    }
    public List<DataTierEntity> getByDataAttributeIdAndBaseValueContainsAndSupporting1Value(@PathVariable Long dataattributeId,@PathVariable String basesearch,  @PathVariable String supporting1search)
    {
        return dataTierRepository.findByDataAttributeIdEqualsAndBaseValueContainsIgnoreCaseAndSupportingValue1ContainsIgnoreCase(dataattributeId,basesearch, supporting1search);
    }

}
