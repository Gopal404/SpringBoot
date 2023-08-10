package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.service.CourseService;

import jakarta.websocket.server.PathParam;

@RestController

@RequestMapping(value = "/")
@CrossOrigin("http://localhost:4200")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping(value="/addCourse",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Course addCourse(@RequestBody Course course) {
		System.out.println(course.course_name);
		System.out.println(course.description);
		System.out.println(course.prerequisites);
		System.out.println(course.credits);
		return courseService.saveCourse(course);
	}
	
	@PostMapping("/updateCourse")
	public Course alterCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
	
	@GetMapping("/getCourse")
	public Optional<Course> getParticularCourse(@RequestParam("course_id") Long courseId) {
			return courseService.getCourseById(courseId);
	}
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourse() {
			return courseService.getAllCourses();
	}
	
	@DeleteMapping("/deleteCourse")
	public void deleteCourse(@RequestParam("course_id") Long courseId) {
		courseService.deleteCourseById(courseId);
	}
}
