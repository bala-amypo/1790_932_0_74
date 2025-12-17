package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class StudentEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String  name;
  private String email;
  private float cgp; 

  StudentEntity(Long id , String name , String email , float cgp)
  {
  this.id = id;
  this.name = name;
  this.email = email;
  this.cgp = cgp; 

  }


  public void setName(String name)
  {
  this.name = name; 
  }


  public void setEmail(String Email)
  {
  this.email = email; 
  }


  public void setcgp(String cgp)
  {
  this.cgp = cgp; 
  }
  
  public void getName(String name)
  {
     return name; 
  }
    
  public void getEmail(String email)
  {
     return email; 
  }
  
  public void getCgp(float age)
  {
     return age; 
  }



}