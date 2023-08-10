package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long course_id;
	@Column(name="course_name")
	public String course_name;
	@Column(name="description")
	public String description;
	@Column(name="prerequisites")
	public String prerequisites;
	@Column(name="credits")
	public Integer credits;
	
	public Long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public Course(Long course_id, String course_name, String description, String prerequisites, Integer credits) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.description = description;
		this.prerequisites = prerequisites;
		this.credits = credits;
	}
	public Course() {
		super();
	}
	
	
	
}
