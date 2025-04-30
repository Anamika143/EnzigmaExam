package com.exam.service;

import java.util.List;
import java.util.Optional;

import com.exam.pojos.Exam;

public interface ExamServiceInterface {
	
	
	String addnewTask(Exam newBook);
	List<Exam> getAllTask(Exam newBook);
	Optional<Exam> getSingleTask(Long TaskId);
	String UpdateTask(Long Taskid,Exam newbook);
	String DeleteTask(Long TaskId);


}
