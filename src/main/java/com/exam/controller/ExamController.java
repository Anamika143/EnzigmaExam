package com.exam.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.pojos.Exam;
import com.exam.service.*;


@RestController
@RequestMapping("/tasks")
public class ExamController {
	@Autowired
	private ExamServiceInterface examServiceInterface;
	
	public ExamController() {
		System.out.println("in Book Controller"+ getClass());
	}
	@PostMapping//insert 
	public String addnewBook(Exam task)
	{
		System.out.println("In add book"+getClass());
		return examServiceInterface.addnewTask(task)+"book added successfully";
	
	}
	@GetMapping("/{taskId}")//getone book
	public Optional<Exam> getOneBook(Long taskId) {
		return examServiceInterface.getSingleTask(taskId);
	}
	@DeleteMapping("/{taskId}")//delete one by id
	public String DeleteById(Long taskId) {
		return examServiceInterface.DeleteTask(taskId)+"deleted sucessfully ";
	}
	@PutMapping("/{taskId}")//update by id
	public String UpdateBook(Long Id,Exam newtask) {

		return examServiceInterface.UpdateTask(Id, newtask)+"updated successfully ";
	}

}
