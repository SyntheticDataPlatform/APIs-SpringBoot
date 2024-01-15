package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "refdata_professiontypes")
public class RefDataProfessionTypesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professiontypeid", nullable = false, length = 6)
    private String professionTypeId;
    @Basic
    @Column(name = "professiontypename", nullable = true, length = 30)
    private String professionTypeName;
    @Basic
    @Column(name = "createduser", nullable = true)
    private Timestamp createdUser;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    
}
