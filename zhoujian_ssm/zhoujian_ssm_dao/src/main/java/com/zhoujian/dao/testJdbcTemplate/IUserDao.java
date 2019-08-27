package com.zhoujian.dao.testJdbcTemplate;


import com.zhoujian.ssm1.domain.User;

import javax.swing.text.StyledEditorKit;
import java.util.List;

public interface IUserDao {
    //插入
    Integer save(User user) throws Exception;
    //查询所有
    List<User>  findAll() throws Exception;
    //按id查询
    User findById(String id) throws Exception;
    //按name查询
    User findByName(String name) throws Exception;
    //删除
    Integer delete(String id) throws Exception;
    //修改
    Integer update(User user) throws Exception;
}
