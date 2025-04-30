package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.dao.ExamDao;
import com.exam.pojos.Exam;
@Service
@Transactional
public class ExamServiceImpl implements ExamServiceInterface {
	@Autowired
	private ExamDao examDao;
	
	@Override
	public String addnewTask(Exam newTask) {
		System.out.println("in add new book");
		Exam task = examDao.save(newTask);
		return "new task added"+task.getTaskId();
	}

	@Override
	public List<Exam> getAllTask(Exam newTask) {
		
		return examDao.findAll();
	}

	@Override
	public Optional<Exam> getSingleTask(Long TaskId) {
		// TODO Auto-generated method stub
		
		return examDao.findById(TaskId);
	}

	@Override
	public String UpdateTask(Long Taskid, Exam newtask) {
		// TODO Auto-generated method stub
		if(examDao.existsById(Taskid)) {
			examDao.save(newtask);
			
		}
		return "updated task succcessfully";
	}

	@Override
	public String DeleteTask(Long TaskId) {
		// TODO Auto-generated method stub
		if(examDao.existsById(TaskId)) {
			examDao.deleteById(TaskId);
		}
		return "task deleted successfully";
	}
	
	

}
