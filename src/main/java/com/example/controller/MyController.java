package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repository.StudentRepo;

@RestController
public class MyController {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/test")
	public String show(){
		return "Hi Tausif...!, your first SpringBoot Project is successfully deployed on AWS ...!";
		}
	
	@GetMapping("/show")
	public ResponseEntity<List<Student>> display(){
		List<Student> s=repo.findAll();
		//s.forEach(i-> System.out.println(i));
		return new ResponseEntity<>(s,HttpStatus.OK);
		
	}
	
	@GetMapping("/show/{id}")
	public ResponseEntity<Student> display1(@PathVariable int id){
		Student s=repo.findById(id).get();
		return new ResponseEntity<>(s,HttpStatus.OK);
		
	}

}
