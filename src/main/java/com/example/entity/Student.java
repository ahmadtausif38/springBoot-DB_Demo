package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	private int id;
	private String name;
	private String email;

}
