package com.test.dataskills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ValueGenerationType;
import org.hibernate.id.UUIDGenerationStrategy;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "USER_ADDRESS")
public class UserAddress {

    @Id
    @Column(name = "addressid", nullable = false)
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name="uuidGenerator", strategy = "uuid2")
    private UUID addressId;

    @Column(name = "appuser_address")
    private UUID appUserAddressId;

    @Column(name = "address")
    private String address;

    public UserAddress(){}
    public UserAddress(UUID appUserAddressId, String address) {
        this.appUserAddressId = appUserAddressId;
        this.address = address;
    }

    public UUID getAppUserAddressId() {
        return appUserAddressId;
    }

    public void setAppUserAddressId(UUID appUserAddressId) {
        this.appUserAddressId = appUserAddressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
