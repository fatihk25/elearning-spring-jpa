package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByCourseId(int id);
    List<Course> findCourseByNameContaining(String name);
}
