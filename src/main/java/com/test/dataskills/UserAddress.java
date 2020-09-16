//package com.test.dataskills;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.id.UUIDGenerationStrategy;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.UUID;
//
//
//@Entity
//@Table(name = "USER_ADDRESS")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class UserAddress {
//
//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
//    private UUID appUserAddressId;
//
//    private String address;
//}
