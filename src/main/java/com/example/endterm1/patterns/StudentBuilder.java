package com.example.endterm1.patterns;

import com.example.endterm1.model.Student;

public class StudentBuilder {
    private int id;
    private String name;
    private String email;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Student build() {
        return new Student(id, name, email);
    }
}
