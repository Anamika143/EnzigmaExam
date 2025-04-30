package com.exam.dto;

import com.exam.pojos.Category;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class TeamDTO extends BaseDto {

	private Long bookId;
	private String bookTitle;
	private Category categoryName;
	private String publishDate;
	private String author;
	private double price;
	private String publication;
}
   