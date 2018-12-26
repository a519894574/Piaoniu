package com.pgj.demo.dao;

import com.comm.comm.entity.Discount;
import com.comm.comm.model.Discounts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountDao {
    int insertDiscount(Discount discount);
    List<Discounts> selectByUidAndSid(Discount discount);
    List<Discounts> selectByUidAndShowid(Discount discount);
    List<Discount>  selectByStatus();
    void updateByDid(Discount discount);
    int updateByDids(Discount discount);
}
