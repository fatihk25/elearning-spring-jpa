package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveData() {
        Course cyberCourse = Course.builder()
                .name("Cyber Security")
                .duration(10)
                .credit(2)
                .build();

        Course aiCourse = Course.builder()
                .name("Artificial Intelligence")
                .duration(10)
                .credit(2)
                .build();

        courseRepository.saveAll(List.of(cyberCourse, aiCourse));
    }

    @Test
    public void printFindById() {
        List<Course> courses = courseRepository.findCourseByCourseId(1);
        System.out.println("Course : " + courses);
    }

    @Test
    public void printByName() {
        List<Course> courses = courseRepository.findCourseByNameContaining("c");
        System.out.println("Course : " + courses);
    }
}