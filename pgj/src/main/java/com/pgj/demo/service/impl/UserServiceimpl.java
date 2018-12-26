package com.pgj.demo.service.impl;

import com.comm.comm.entity.User;
import com.pgj.demo.dao.UserDao;
import com.pgj.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceimpl implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public User findAllByUser_id(int user_id) {
        return userDao.findAllByUser_id(user_id);
    }

    @Override
    public int updateBytelephone(User user) {
        return userDao.updateBytelephone(user.getUser_id(),user.getUser_headphoto(),user.getUser_signature());
    }

    @Override
    public int updatebalanceByid(User user) {
        user.setUser_balance(this.findAllByUser_id(user.getUser_id()).getUser_balance()+user.getUser_balance());
        return userDao.updatebalanceByid(user.getUser_id(),user.getUser_balance());
    }
}
