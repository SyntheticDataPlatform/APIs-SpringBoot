package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "platform_datastructures")
public class PlatformDataStructuresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platformdatastructuresid", nullable = false)
    private short platformDataStructuresId;
    @Basic
    @Column(name = "datastructurename", nullable = true, length = 65)
    private String dataStructureName;
    @Basic
    @Column(name = "platformdatastructuresguid", nullable = true, length = 256)
    private String platformDataStructuresGuid;
    @Basic
    @Column(name = "createduser", nullable = true, length = 20)
    private String createdUser;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @ManyToOne
    @JoinColumn(name = "sensitivityflagid", referencedColumnName = "sensitiveFlagId")
    private RefDataSensitivityFlagEntity sensitivityFlag;
    @ManyToOne
    @JoinColumn(name = "registeredapp", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;

}
