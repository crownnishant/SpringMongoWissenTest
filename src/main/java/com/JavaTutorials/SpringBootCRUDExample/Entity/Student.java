package com.JavaTutorials.SpringBootCRUDExample.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="STUDENT_TBL")

public class Student {
	@Id
	@GeneratedValue
		
		private String studentName;
		private String studentEmail;
		private int studentId;
		private String studentJoiningDate;
		
		
}
