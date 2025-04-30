package com.exam.pojos;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="books")
@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
public class Exam {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;
	@Column(length=50,name="Title_of_task")
	private String taskTitle;
	
	

}
