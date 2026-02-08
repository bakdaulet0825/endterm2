package com.example.endterm1.patterns;

import com.example.endterm1.model.Course;

public class CourseFactory {

    public static Course createCourse(String name, int credits) {
        return new Course(name, credits);
    }
}
