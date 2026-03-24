package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
