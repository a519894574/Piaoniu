package com.pgj.demo.service;

import com.comm.comm.entity.User;

public interface UserService {
    User findAllByUser_id(int user_id);
    int updateBytelephone(User user);
    int updatebalanceByid(User user);

}
