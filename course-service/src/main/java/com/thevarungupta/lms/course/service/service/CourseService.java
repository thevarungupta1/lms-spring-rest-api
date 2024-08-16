package com.thevarungupta.lms.course.service.service;

import com.thevarungupta.lms.course.service.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course saveCourse(Course course);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}
