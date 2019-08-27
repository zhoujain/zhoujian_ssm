package com.zhoujian.dao.testJdbcTemplate;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class test1 {
    public static void main(String[] args) {
        //准备数据源 阿里
        DruidAbstractDataSource dataSource = new DruidDataSource();
        //DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ssm?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("zhou");

        //创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(dataSource);


        //jt.execute("insert into users(id,email,username,password,phoneNum,status)values('3','xxx','xxx','xxx','xxx','1')");
        //execute 执行SQL语句 比如创建数据库
        //update  插入，更新和删除返回影响的行数
        //query 用于数据库的查询
            //query(Sting,RowMapper row)返回RowMapperd的List类型结果
            //query(String,PreparedStatmentSetter,RowMapper)创建PrepareStatment对象
            //queryForObjec(String,RowMapper,Object[])t 通过RowMapper返回Object的单行数据
            //queryForList(String Object[],Class<T> elementType)多行数据

    }
}
