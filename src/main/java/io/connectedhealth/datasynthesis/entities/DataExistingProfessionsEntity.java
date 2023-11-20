package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Data
@Table(name = "dataexisting_profession")
public class DataExistingProfessionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professionid", nullable = false)
    private long professionId;
    @Basic
    @Column(name = "professionname", nullable = true, length = 9)
    private String professionName;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "createduser", nullable = true, length = 20)
    private String createdUser;
   @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @ManyToOne
    @JoinColumn(name = "registeredapp", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;

}
