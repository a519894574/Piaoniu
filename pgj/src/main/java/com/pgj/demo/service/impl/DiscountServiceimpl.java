package com.pgj.demo.service.impl;

import com.comm.comm.entity.Discount;
import com.comm.comm.model.Discounts;
import com.pgj.demo.dao.DiscountDao;
import com.pgj.demo.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DiscountServiceimpl implements DiscountService {
    @Resource
    DiscountDao discountDao;
    @Override
    public int insertDiscount(Discount discount) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String begin=dateFormat.format(date);
        String end=dateFormat.format(new Date(date.getTime() + (long)30 * 24 * 60 * 60 * 1000));
        int s=0;
            for (int i=1;i<=5;i++){
                discount.setShowt_id(i);
                discount.setDiscount_begin(begin);
                discount.setDiscount_end(end);
                discount.setDiscount_money(20);
                discount.setDiscount_status_id(1);
                s++;
            discountDao.insertDiscount(discount);
        }
        return s;
    }

    @Override
    public List<Discounts> selectByUidAndSid(Discount discount) {
        return discountDao.selectByUidAndSid(discount);
    }

    @Override
    public List<Discounts> selectByUidAndShowid(Discount discount) {
        return discountDao.selectByUidAndShowid(discount);
    }

    @Override
    public void updateByDid() {
        List<Discount> list=discountDao.selectByStatus();
        Date date=new Date();
        for(int i=1;i<list.size();i++){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date1 = sdf.parse(list.get(i).getDiscount_end());
                if(date.after(date1)){
                    discountDao.updateByDid(list.get(i));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int updateByDids(Discount discount) {
        List<Discounts> list=this.selectByUidAndShowid(discount);
        int s=0;
        for(int i=0;i<list.size();i++){
            Discount discount1=new Discount();
            System.out.println(list.get(i).getDiscount_id());
            discount1.setDiscount_id(list.get(i).getDiscount_id());
            discountDao.updateByDids(discount1);
            s++;
        }
        return s;
    }

}
