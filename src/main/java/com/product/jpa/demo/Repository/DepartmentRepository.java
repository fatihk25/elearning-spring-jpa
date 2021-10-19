package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findDepartmentByDepartmentId(int id);
    List<Department> findDepartmentByName(String name);
    List<Department> findDepartmentByNameContaining(String name);
}
