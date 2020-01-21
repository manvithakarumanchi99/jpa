package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class student {
	@Id
	@Column(name="roll_number")
	private int rollNumber;
	@Column(name="student_name")
	private String studentName;
	@Column(name="student_score")
	private double studentScore;

	
	public student() {
		
	}

	public student(int rollNumber, String studentName, Double studentScore) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(Double studentScore) {
		this.studentScore = studentScore;
	}

	@Override
	public String toString() {
		return "student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}

}
