package com.test.dataskills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface AppAddressRepo extends JpaRepository<UserAddress, UUID> {
    @Query(value = "select * from user_address u where u.address = ?1", nativeQuery = true)
    UserAddress findByAddress(String address);
}
