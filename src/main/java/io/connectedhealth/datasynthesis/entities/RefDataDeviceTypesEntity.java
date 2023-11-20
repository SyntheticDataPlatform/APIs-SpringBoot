package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "refdata_devicetypes")
public class RefDataDeviceTypesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "devicetypeid", nullable = false)
    private short deviceTypeId;
    @Basic
    @Column(name = "devicetype", nullable = true, length = 65)
    private String deviceType;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity statusId;

}
