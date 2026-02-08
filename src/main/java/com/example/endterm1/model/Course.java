package com.example.endterm1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int credits;

    public Course() { }

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public Course(int id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getCredits() { return credits; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCredits(int credits) { this.credits = credits; }
}
