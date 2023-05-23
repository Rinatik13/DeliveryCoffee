package com.Coffee.Delivery.DAO;

import com.Coffee.Delivery.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class DAOImpl implements DAO{
    @Autowired
    JdbcTemplate jdbc;
    public DAOImpl(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }
    @Override
    public void addNewConsumer() {
        Consumer consumer = new Consumer();
        consumer.setName("Ivan");
        String sql = "INSERT INTO consumer VALUES (NULL, ?)";
        System.out.println("start DAO add new consumer");
        jdbc.update(sql,consumer.getName());
        System.out.println("end DAO add new consumer");
    }
}
