package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

@R
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

}