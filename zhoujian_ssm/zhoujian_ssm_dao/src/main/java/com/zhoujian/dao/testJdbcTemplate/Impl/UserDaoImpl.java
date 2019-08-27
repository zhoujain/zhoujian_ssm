package com.zhoujian.dao.testJdbcTemplate.Impl;

import com.zhoujian.dao.testJdbcTemplate.IUserDao;
import com.zhoujian.ssm1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer save(User user)throws Exception {
        String sql = "insert into users(id,email,username,password,phoneNum,status)values(?,?,?,?,?,?)";
        Object[] object = new Object[]{
                user.getId(),
                user.getEmail(),
                user.getUsername(),
                user.getPassword(),
                user.getPhoneNum(),
                user.getStatus()
        };
        return this.jdbcTemplate.update(sql,object);
    }

    @Override
    public List<User> findAll() throws Exception {
        String sql = "select * from users";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public User findById(String id) throws Exception {
        String sql = "select * from users where id = ?";
        Object [] objects = new Object[]{
            id
        };
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,objects);
    }

    @Override
    public User findByName(String name) throws Exception {
        String sql = "select * from users where username = ?";
        Object [] objects = new Object[]{
                name
        };
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,objects);
    }

    @Override
    public Integer delete(String id) throws Exception {
        String sql = "delete from users where id= ?";
        Object [] objects = new Object[]{
                id
        };
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public Integer update(User user) throws Exception {
        return null;
    }
}
