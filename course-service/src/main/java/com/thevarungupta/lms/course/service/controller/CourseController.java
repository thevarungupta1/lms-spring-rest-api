package com.thevarungupta.lms.course.service.controller;

import com.netflix.discovery.converters.Auto;
import com.thevarungupta.lms.course.service.entity.Course;
import com.thevarungupta.lms.course.service.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/courses")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long id){
        return ResponseEntity.ok(courseService.getCourseById(id));
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse( @RequestBody Course course){
        return ResponseEntity.ok(courseService.saveCourse(course));
    }
}
