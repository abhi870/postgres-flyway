package com.test.dataskills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "appuser")
public class AppUser {

    public AppUser(){}
    @Id
    @Column(name = "appuserid")
    private Long appuserid;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    public Long getAppuserid() {
        return appuserid;
    }

    public void setAppuserid(Long appuserid) {
        this.appuserid = appuserid;
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
}
