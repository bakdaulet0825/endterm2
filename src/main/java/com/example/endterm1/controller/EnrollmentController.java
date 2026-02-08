package com.example.endterm1.controller;

import com.example.endterm1.model.Enrollment;
import com.example.endterm1.repository.EnrollmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentController(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable int id) {
        enrollmentRepository.deleteById(id);
    }
}
