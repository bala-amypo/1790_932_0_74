package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

@repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

}