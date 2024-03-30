package com.tutofox.springboot_rutuja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutofox.springboot_rutuja.entity.student;
import com.tutofox.springboot_rutuja.repo.Repo;

@Service
public class student_service 
{
	@Autowired
	private Repo repo;
	public student saveStudent(student student)
	{
		return repo.save(student);
	}
	
	public List<student> getAllStudent()
	{
		return repo.findAll();
	}
	
	public student get(int id)
	{
		Optional<student> optional=repo.findById(id);
		if(optional.isPresent())
		{
			 return optional.get();	
		}
		return null;
	}
	
	public student delete(int id)
	{
		Optional<student> optional=repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			 return optional.get();	
		}
		return null;
	}
	
	public student update(student student,int id)
	{
		Optional<student> optional=repo.findById(id);
		student dbStudent= new student();
		if(optional.isPresent())
		{
			dbStudent=optional.get();
			student.setId(dbStudent.getId());
			return repo.save(student);
		}
		return null;
	}

}
