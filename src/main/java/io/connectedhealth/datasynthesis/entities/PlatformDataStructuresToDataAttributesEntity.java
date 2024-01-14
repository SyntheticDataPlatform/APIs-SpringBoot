package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "platform_datastructures_dtl")
public class PlatformDataStructuresToDataAttributesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platformdatastructurestodataattributesid", nullable = false)
    private short platformDataStructuresToDataAttributesId;
    @Basic
    @Column(name = "compositeDatastructurename", nullable = true, length = 50)
    private String compositeDataStructureName;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "createduser", nullable = true, length = 20)
    private String createdUser;
    @Basic
    @Column(name = "PlatformDataStructuresToDataAttributesGUID", nullable = true, length = 38)
    private String platformDataStructuresToDataAttributesGuid;
    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @ManyToOne
    @JoinColumn(name = "RegisteredApp", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;
    @ManyToOne
    @JoinColumn(name = "SensitivityFlagID", referencedColumnName = "SensitiveFlagID")
    private RefDataSensitivityFlagEntity sensitivityFlag;
    @ManyToOne
    @JoinColumn(name = "PlatformDataAttributesID", referencedColumnName = "PlatformDataAttributesID")
    private PlatformDataAttributesEntity platformDataAttributes;
    /*
    @ManyToOne
    @JoinColumn(name = "PlatformDataStructuresID", referencedColumnName = "PlatformDataStructuresID")
    private PlatformConfigDataStructuresEntity platformDataStructures;
    */


}
