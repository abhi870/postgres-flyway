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

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "useraddid")
    private AppUser appUser;

    public UserAddress(){}

    public UUID getAddressId() {
        return addressId;
    }

    public void setAddressId(UUID addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public UserAddress(UUID addressId, String address, AppUser appUser) {
        this.addressId = addressId;
        this.address = address;
        this.appUser = appUser;
    }
}
