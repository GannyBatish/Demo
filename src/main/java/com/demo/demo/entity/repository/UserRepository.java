package com.demo.demo.entity.repository;

import com.demo.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByFirstNameAndLastName(String firstName,String Lastname);

    User findByAgeGreaterThan(Integer age);

}
