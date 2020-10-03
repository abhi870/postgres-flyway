package com.test.dataskills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "appuser")
public class AppUser {

    public AppUser(){}
    @Id
    @Column(name = "appuserid")
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name="uuidGenerator", strategy = "uuid2")
    private UUID appuserid;

    @Column(name = "useraddid")
    private UUID userAddressId;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "appuser_address")
//    private List<UserAddress> userAddress;


    public UUID getAppuserid() {
        return appuserid;
    }

    public void setAppuserid(UUID appuserid) {
        this.appuserid = appuserid;
    }

    public UUID getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(UUID userAddressId) {
        this.userAddressId = userAddressId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AppUser(UUID appuserid, UUID userAddressId, String firstName, String lastName) {
        this.appuserid = appuserid;
        this.userAddressId = userAddressId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
