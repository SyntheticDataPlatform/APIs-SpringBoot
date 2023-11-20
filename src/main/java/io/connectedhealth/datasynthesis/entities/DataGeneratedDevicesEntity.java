package io.connectedhealth.datasynthesis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "datagenerated_devices")
public class DataGeneratedDevicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "devicesid", nullable = false)
    private long devicesId;
    @Basic
    @Column(name = "devicename", nullable = true, length = 10)
    private String deviceName;
    @Basic
    @Column(name = "createddate", nullable = true)
    private Timestamp createdDate;
    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "StatusID")
    private RefDataStatusEntity status;
    @ManyToOne
    @JoinColumn(name = "application", referencedColumnName = "AppGUID")
    private RefDataApplicationEntity registeredApp;
    @ManyToOne
    @JoinColumn(name = "devicetypeid", referencedColumnName = "DeviceTypeID")
    private RefDataDeviceTypesEntity deviceType;
}
