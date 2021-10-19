package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    List<Instructor> findInstructorByFirstNameContaining(String firstName);
    List<Instructor> findInstructorByInstructorId(int id);
}
