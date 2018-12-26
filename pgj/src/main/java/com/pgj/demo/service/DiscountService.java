package com.pgj.demo.service;

import com.comm.comm.entity.Discount;
import com.comm.comm.model.Discounts;

import java.util.List;

public interface DiscountService {
    int insertDiscount(Discount discount);
    List<Discounts> selectByUidAndSid(Discount discount);
    List<Discounts> selectByUidAndShowid(Discount discount);
    void updateByDid();
    int updateByDids(Discount discount);
}
