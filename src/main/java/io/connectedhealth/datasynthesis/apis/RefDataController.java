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
//


@RestController
@RequestMapping("/api")
public abstract class RefDataController {
    @Autowired
    private RefDataApplicationsRepository applicationsRepository;
    @Autowired
    private RefDataCodesetsRepository codesetsRepository;
    @Autowired
    private RefDataCountriesRepository countriesRepository;
    @Autowired
    private RefDataDeviceTypesRepository deviceTypesRepository;
    @Autowired
    private RefDataIndustryStdRepository industryStdRepository;
    @Autowired
    private RefDataLegalEntitiesRepository legalEntitiesRepository;
    @Autowired
    private RefDataOperatonTypeRepository operatonTypeRepository;
    @Autowired
    private RefDataOrganizationRepository organizationRepository;
    @Autowired
    private RefDataStatusRepository statusCodeRepository;
    @Autowired
    private RefDataTimeZoneRepository timeZoneRepository;
    @Autowired
    private RefDataUSStatesRepository usStatesRepository;
    @Autowired
    private RefDataSensitivityFlagRepository sensitivityFlagRepository;

    // get current DateTime
    @GetMapping("/getTime")
    public abstract String ReturnDateTime();
    // get all applications
    @GetMapping("/applications")
    public List<RefDataApplicationEntity> getAllApplications(){ return applicationsRepository.findAll();}

    // get applications by like desc
    @GetMapping("/applications/desc/{appcodedescvalue}")
    public List<RefDataApplicationEntity> getOrganizationDetails(@PathVariable String appcodedescvalue){
        return (List<RefDataApplicationEntity>) applicationsRepository.findByApplicationDescContainingIgnoreCase(appcodedescvalue);
    }
    // get all countries
    @GetMapping("/countries")
    public List<RefDataCountriesEntity> getAllCountries(){ return countriesRepository.findAll();}

    // get countries by like codename
    @GetMapping("/countries/desc/{countrycodevalue}")
    public List<RefDataCountriesEntity> getCountryDetails(@PathVariable String countrycodevalue){
        return (List<RefDataCountriesEntity>) countriesRepository.findByCountryNameContainingIgnoreCase(countrycodevalue);
    }

    // get all countries
    @GetMapping("/codesets")
    public List<RefDataCodeSetEntity> getAllCodesets(){ return codesetsRepository.findAll();}

    // get countries by like codename
    @GetMapping("/codesets/desc/{codesetvalue}")
    public List<RefDataCodeSetEntity> getCodesetDetails(@PathVariable String codesetvalue){
        return (List<RefDataCodeSetEntity>) codesetsRepository.findByCodeSetNameContainingIgnoreCase(codesetvalue);
    }
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

    // get all industrystds
    @GetMapping("/industrystds")
    public List<RefDataIndustryStdEntity> getAllIndustryStds(){ return industryStdRepository.findAll();}

    // get industrystds by like desc
    @GetMapping("/industrystds/desc/{termnamevalue}")
    public List<RefDataIndustryStdEntity> getIndustryStdsDetails(@PathVariable String termnamevalue){
        return (List<RefDataIndustryStdEntity>) industryStdRepository.findByIndustryStdContainsIgnoreCase(termnamevalue);
    }
    // get all legalentities
    @GetMapping("/legalentities")
    public List<RefDataLegalEntityEntity> getAllLegalEntities(){ return legalEntitiesRepository.findAll();}

    // get legalentities by like desc
    @GetMapping("/legalentities/desc/{orgvalue}")
    public List<RefDataLegalEntityEntity> getLegalEntityDetails(@PathVariable String orgvalue){
        return (List<RefDataLegalEntityEntity>) legalEntitiesRepository.findByLocationNameContainingIgnoreCase(orgvalue);
    }
    // get all operationtypes
    @GetMapping("/operationtypes")
    public List<RefDataOperationTypeEntity> getAllOperationTypesCodes(){ return operatonTypeRepository.findAll();}

    // get operationtypes by like codename
    @GetMapping("/operationtypes/desc/{optypecodevalue}")
    public List<RefDataOperationTypeEntity> getOperationTypeDetails(@PathVariable String optypecodevalue){
        return (List<RefDataOperationTypeEntity>) operatonTypeRepository.findByOperationTypeNameContainingIgnoreCase(optypecodevalue);
    }

    // get all organizations
    @GetMapping("/organizations")
    public List<RefDataOrganizationEntity> getAllOrganizations(){ return organizationRepository.findAll();}

    // get organizations by like desc
    @GetMapping("/organizations/desc/{orgvalue}")
    public List<RefDataOrganizationEntity> getOrganizationalDetails(@PathVariable String orgvalue){
        return (List<RefDataOrganizationEntity>) organizationRepository.findByOrganizationNameContainingIgnoreCase(orgvalue);
    }

    // get all sensitivityflags
    @GetMapping("/sensitivityflags")
    public List<RefDataSensitivityFlagEntity> getAllSensitivityCodes(){ return sensitivityFlagRepository.findAll();}

    // get sensitivityflags by like desc
    @GetMapping("/sensitivityflags/desc/{sensitivitycodevalue}")
    public List<RefDataSensitivityFlagEntity> getSensivityFlagDetails(@PathVariable String sensitivitycodevalue){
        return (List<RefDataSensitivityFlagEntity>) sensitivityFlagRepository.findBySensitiveFlagDescContainingIgnoreCase(sensitivitycodevalue);
    }
    // get all statuscodes
    @GetMapping("/statuscodes")
    public List<RefDataStatusEntity> getAllStatusCodes(){ return statusCodeRepository.findAll();}

    // get statuscodes by like codename
    @GetMapping("/statuscodes/desc/{statuscodevalue}")
    public List<RefDataStatusEntity> getAreaCodeDetails(@PathVariable String statuscodevalue){
        return (List<RefDataStatusEntity>) statusCodeRepository.findByStatusDescriptionContainingIgnoreCase(statuscodevalue);
    }

    // get all timezones
    @GetMapping("/timezones")
    public List<RefDataTimeZonesEntity> getAllTimeZones(){ return timeZoneRepository.findAll();}

    // get timezones by code
    @GetMapping("/timezones/id/{timezonevalue}")
    public List<RefDataTimeZonesEntity> getTimeZoneCodeDetails(@PathVariable String timezonevalue){
        return (List<RefDataTimeZonesEntity>) timeZoneRepository.findByTimeZoneValueContainingIgnoreCase(timezonevalue);
    }
    // TimeZones by TimeZone Desc
    @GetMapping("/timezones/desc/{timezonedesc}")
    public List<RefDataTimeZonesEntity> getTimeZoneDescDetails(@PathVariable String timezonedesc){
        return (List<RefDataTimeZonesEntity>) timeZoneRepository.findByTimeZoneDescContainsIgnoreCase(timezonedesc);
    }
    // get all usstates
    @GetMapping("/usstates")
    public List<RefDataUsStatesEntity> getAllUSStateCodes(){ return usStatesRepository.findAll();}

    // get usstates by like desc
    @GetMapping("/usstates/desc/{statecodevalue}")
    public List<RefDataUsStatesEntity> getUSStateCodeDetails(@PathVariable String statecodevalue){
        return (List<RefDataUsStatesEntity>) usStatesRepository.findByStateDescriptionContainsIgnoreCase(statecodevalue);
    }
  }
