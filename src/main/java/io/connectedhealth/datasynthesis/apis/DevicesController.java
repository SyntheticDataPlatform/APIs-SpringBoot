package io.connectedhealth.datasynthesis.apis;

import io.connectedhealth.datasynthesis.entities.DataGeneratedDevicesEntity;
import io.connectedhealth.datasynthesis.repository.DataGeneratedDevicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class DevicesController {

    @Autowired
    private DataGeneratedDevicesRepository devicesRepository;

    // get all devices
    @GetMapping("/devices")
    public List<DataGeneratedDevicesEntity> getAllDevices(){
        return devicesRepository.findAll();
    }

    // get abanks by id rest api
   /*
    @GetMapping("/device/id/{abaBankId}")
    public DataExistingAbaBankingEntity getABABanksByID(@PathVariable Long abaBankId){
        return abaBankingRepository.findByAbaBankingId(abaBankId);
    }
     */
    // get devives by like names
    @GetMapping("/devices/name/{devicename}")
    public List<DataGeneratedDevicesEntity> getDevicesNamesLike(@PathVariable String devicename){
        return devicesRepository.findByDeviceNameContainingIgnoreCase(devicename);
    }

}
