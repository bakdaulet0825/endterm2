package com.example.endterm1.service;

import com.example.endterm1.model.Course;
import com.example.endterm1.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(int id, Course updatedCourse) {
        return courseRepository.findById(id).map(course -> {
            course.setName(updatedCourse.getName());
            course.setCredits(updatedCourse.getCredits());
            return courseRepository.save(course);
        }).orElse(null);
    }

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
}
