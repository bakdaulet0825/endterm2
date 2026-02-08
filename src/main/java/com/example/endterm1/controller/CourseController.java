package com.example.endterm1.controller;

import com.example.endterm1.model.Course;
import com.example.endterm1.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course) {
        Course existing = courseRepository.findById(id).orElseThrow();
        existing.setName(course.getName());
        existing.setCredits(course.getCredits());
        return courseRepository.save(existing);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseRepository.deleteById(id);
    }
}
