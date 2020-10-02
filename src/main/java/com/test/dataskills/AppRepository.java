package com.test.dataskills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface AppRepository extends JpaRepository<AppUser, UUID> {

    @Transactional
    void deleteByFirstName(String firstName);

    @Query(value = "select * from appuser u where u.first_name = ?1", nativeQuery = true)
    AppUser findByFirstName(String firstName);
}
