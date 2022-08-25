package com.test.cafe.dao;

import com.test.cafe.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    public User findByEmailId(@Param("email") String email);
}
