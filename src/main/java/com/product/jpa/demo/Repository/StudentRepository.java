package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findStudentByStudentId(int id);
    List<Student> findStudentByFirstNameContaining(String firstName);
}
