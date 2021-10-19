package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Instructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Repository
class InstructorRepositoryTest {
    @Autowired
    private InstructorRepository instructorRepository;

    @Test
    public void saveAll() {
        Instructor instructor = Instructor.builder()
                .firstName("Khoir")
                .lastName("Fatih")
                .phone("123455")
                .build();
        Instructor instructor1 = Instructor.builder()
                .firstName("Paul")
                .lastName("McCratney")
                .phone("1234567")
                .build();

        instructorRepository.saveAll(List.of(instructor1, instructor));
    }

    @Test
    public void printInstructorByNameContaining() {
        List<Instructor> instructors =
                instructorRepository.findInstructorByFirstNameContaining("k");

        System.out.println("Instructor : " + instructors);
    }

    @Test
    public void printInstructorByInstructorId() {
        List<Instructor> instructors =
                instructorRepository.findInstructorByInstructorId(1);

        System.out.println("Instructor : " + instructors);
    }
}