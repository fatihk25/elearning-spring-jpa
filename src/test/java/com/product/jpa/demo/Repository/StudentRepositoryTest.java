package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveData() {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Lennon")
                .phone("12345")
                .build();
        Student student1 = Student.builder()
                .firstName("Saitama")
                .lastName("Aizawa")
                .phone("12345678")
                .build();

        studentRepository.saveAll(List.of(student, student1));
    }

    @Test
    public void printFindStudentById() {
        List<Student> students =
                studentRepository.findStudentByStudentId(1);

        System.out.println("Student : " + students);
    }

    @Test
    public void printFindStudentByName() {
        List<Student> students =
                studentRepository.findStudentByFirstNameContaining("John");

        System.out.println("Student : " + students);
    }
}