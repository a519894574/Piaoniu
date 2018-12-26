package com.pgj.demo.dao;


import com.comm.comm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findAllByUser_id(int user_id);
    int updateBytelephone(@Param("user_id") Integer user_id,@Param("user_headphoto") String user_headphoto,@Param("user_signature") String user_signature);

    int updatebalanceByid(@Param("user_id") Integer user_id,@Param("user_balance") Double user_balance);

}
