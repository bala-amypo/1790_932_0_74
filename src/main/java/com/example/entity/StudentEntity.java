package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.id;


@Entity
public class StudentEntity{

  @id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private int id;
  private String  name;
  private String email;
  private int age; 

  StudentEntity()
}