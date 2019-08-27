package com.zhoujian.service.Impl;

import com.zhoujian.dao.testJdbcTemplate.IUserDao;
import com.zhoujian.service.IUserService;
import com.zhoujian.ssm1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userdao;

    @Override
    public Integer save(User user) throws Exception {
        user.setId(UUID.randomUUID().toString());
        user.setStatus(1);
       return userdao.save(user);
    }

    @Override
    public List<User> findAll() throws Exception {
        return userdao.findAll();
    }

    @Override
    public Integer deleteById(String id) throws Exception{
        return userdao.delete(id);
    }
}
