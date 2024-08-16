package com.thevarungupta.lms.course.service.service.impl;

import com.thevarungupta.lms.course.service.entity.Course;
import com.thevarungupta.lms.course.service.repository.CourseRepository;
import com.thevarungupta.lms.course.service.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

    }
}
