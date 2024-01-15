package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "refdata_terminologystd")
public class RefDataTerminologyStdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "terminologystdid", nullable = false, length = 6)
    private String terminologyStdId;
    @Basic
    @Column(name = "terminologystd", nullable = true, length = 25)
    private String terminologyStd;
    @Basic
    @Column(name = "terminologystddesc", nullable = true, length = 129)
    private String terminologyStdDesc;
    @Basic
    @Column(name = "terminologystdversion", nullable = true, length = 10)
    private String terminologyStdVersion;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @ManyToOne
    @JoinColumn(name = "registeredapp", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;
    @ManyToOne
    @JoinColumn(name = "organizationid", referencedColumnName = "organizationGuid")
    private RefDataOrganizationEntity registeredOrg;
}
