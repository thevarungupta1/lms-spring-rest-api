package com.thevarungupta.lms.course.service.repository;

import com.thevarungupta.lms.course.service.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
