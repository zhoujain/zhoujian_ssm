package com.zhoujian.service;

import com.zhoujian.ssm1.domain.User;

import java.util.List;

public interface IUserService {

    Integer save(User user) throws Exception;

    List<User> findAll() throws Exception;

    Integer deleteById(String id) throws Exception;
}
