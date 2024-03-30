package com.tutofox.springboot_rutuja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutofox.springboot_rutuja.entity.student;
import com.tutofox.springboot_rutuja.service.student_service;

@RestController
@RequestMapping("student")
public class rest 
{
	@Autowired
	private student_service service;
	@PostMapping("save")
	public student saveStudent(@RequestBody student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping("All")
	public List<student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@GetMapping("get/{id}")
	public student getStudent(@PathVariable int id) 
	{
		return service.get(id);
	}
	
	@DeleteMapping("delete/{id}")
	public student deleteStudent(@PathVariable int id)
	{
		return service.delete(id);
	}
	
	@PutMapping("update/{id}")
	public student updateStudent(@RequestBody student student,@PathVariable int id)
	{
		return service.update(student, id);
	}
	
}
