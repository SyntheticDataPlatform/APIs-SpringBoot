package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
 /*
@Entity
@Data
@NoArgsConstructor
@Table(name = "platform_config_datastructures")
public class PlatformConfigDataStructuresEntity {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platformdatastructuresid", nullable = false)
   private short platformDataStructuresId;
  /*  @Basic
    @Column(name = "datastructurename", nullable = true, length = 50)
    private String dataStructureName;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "createduser", nullable = true, length = 20)
    private String createdUser;
    @Basic
    @Column(name = "platformdatastructuresguid", nullable = true, length = 38)
    private String platformDataStructuresGuid;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @ManyToOne
    @JoinColumn(name = "registeredapp", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;
    @ManyToOne
    @JoinColumn(name = "sensitivityflagid", referencedColumnName = "SensitiveFlagID")
    private RefDataSensitivityFlagEntity sensitivityFlag;

*/