package io.connectedhealth.datasynthesis.apis;

import io.connectedhealth.datasynthesis.entities.RefDataDeviceTypesEntity;
import io.connectedhealth.datasynthesis.repository.RefDataDeviceTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DeviceTypesController {

    @Autowired
    private RefDataDeviceTypesRepository deviceTypesRepository;

    // get all devicetypes
    @GetMapping("/devicetypes")
    public List<RefDataDeviceTypesEntity> getAllDeviceTypes(){
        return deviceTypesRepository.findAll();
    }

    // get devicetypes by like names
    @GetMapping("/devicetypes/desc/{devicetypedesc}")
    public List<RefDataDeviceTypesEntity> getDataGenTypesLike(@PathVariable String devicetypedesc){
        return deviceTypesRepository.findByDeviceTypeContainingIgnoreCase(devicetypedesc);
    }

}
