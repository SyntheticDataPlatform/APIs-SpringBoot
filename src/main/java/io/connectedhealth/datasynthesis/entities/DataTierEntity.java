package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Data
@Table(name = "datatier")
public class DataTierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "datatierid ", nullable = false)
    private long DataTierId;
    @Basic
    @Column(name = "basevalue", nullable = true, length = 99)
    private String baseValue;
    @Basic
    @Column(name = "supportingvalue1", nullable = true, length = 169)
    private String supportingValue1;
    @Basic
    @Column(name = "supportingvalue2", nullable = true, length = 50)
    private String supportingValue2;
    @Basic
    @Column(name = "supportingvalue3", nullable = true, length = 50)
    private String supportingValue3;
    @Basic
    @Column(name = "supportingvalue4", nullable = true, length = 50)
    private String supportingValue4;
    @Basic
    @Column(name = "supportingvalue5", nullable = true, length = 50)
    private String supportingValue5;
    @Basic
    @Column(name = "supportingvalue6", nullable = true, length = 50)
    private String supportingValue6;
    @Basic
    @Column(name = "supportingvalue7", nullable = true, length = 50)
    private String supportingValue7;
    @Basic
    @Column(name = "createduser", nullable = true, length = 20)
    private String createdUser;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @ManyToOne
    @JoinColumn(name = "registeredapp", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;
    @Basic
    @Column(name = "dataattributeid", nullable = true)
    private long dataAttributeId;
    @Basic
    @Column(name = "datagentypeid", nullable = true)
    private long dataGenTypeId;
}
