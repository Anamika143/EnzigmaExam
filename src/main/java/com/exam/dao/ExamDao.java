package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.pojos.Exam;

public interface ExamDao  extends JpaRepository<Exam, Long>{
	
}
