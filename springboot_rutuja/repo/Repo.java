package com.tutofox.springboot_rutuja.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutofox.springboot_rutuja.entity.student;

@Repository
public interface Repo extends JpaRepository<student, Integer>
{
	
}
