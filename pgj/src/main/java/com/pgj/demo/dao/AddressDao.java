package com.pgj.demo.dao;

import com.comm.comm.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressDao {
    List<Address> findAllByUser_id(int user_id);
    int deleteAddressByAddress_id(int address_id);
    int insertAddress(Address address);
}
