package com.lkx.show.dao.login;

import com.comm.comm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    //查询是否存在
    int findUser(@Param("user_telephone") String phone);

    //注册
    int userAdd(@Param("user_telephone") String phone);

    //获取用户完整信息
    User findPass(@Param("user_telephone") String phone);

}
