package com.example.endterm1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"student_id", "course_id"})})
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Enrollment() { }

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Геттеры и сеттеры
    public int getId() { return id; }
    public Student getStudent() { return student; }
    public Course getCourse() { return course; }

    public void setId(int id) { this.id = id; }
    public void setStudent(Student student) { this.student = student; }
    public void setCourse(Course course) { this.course = course; }
}
