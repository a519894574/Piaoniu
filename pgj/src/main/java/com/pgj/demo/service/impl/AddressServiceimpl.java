package com.pgj.demo.service.impl;

import com.comm.comm.entity.Address;
import com.pgj.demo.dao.AddressDao;
import com.pgj.demo.dao.UserDao;
import com.pgj.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceimpl implements AddressService {
    @Autowired
    private AddressDao addressDao;
    @Override
    public List<Address> findAllByUser_id(int user_id) {
        return addressDao.findAllByUser_id(user_id);
    }

    @Override
    public int deleteAddressByAddress_id(int address_id) {
        return addressDao.deleteAddressByAddress_id(address_id);
    }

    @Override
    public int insertAddress(Address address) {
        return addressDao.insertAddress(address);
    }
}
