package com.pgj.demo.service;

import com.comm.comm.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAllByUser_id(int user_id);
    int deleteAddressByAddress_id(int address_id);
    int insertAddress(Address address);
}
