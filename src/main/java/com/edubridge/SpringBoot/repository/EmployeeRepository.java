package com.edubridge.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.SpringBoot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}