package com.example.sqlconnect.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.sqlconnect.model.Employee_tb;

public interface UserDAO extends CrudRepository<Employee_tb,Integer> {

}
