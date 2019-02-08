package com.jpa.repository;

import com.jpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAll();

    Address findByUserId(Long userId);

    Address findByWardOrCity(String ward, String city);


}
