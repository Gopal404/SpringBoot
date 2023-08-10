package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
