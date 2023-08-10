package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;
import com.example.repositories.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}
	
	public Course updateCourse( Course course) {
		return courseRepo.save(course);
	}
	
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}
	
	public Optional<Course> getCourseById(Long courseId) {
			return courseRepo.findById(courseId);
	}
	
	public void deleteCourseById(Long courseId) {
		courseRepo.deleteById(courseId);
	}
	
}
