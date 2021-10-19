package com.product.jpa.demo.Repository;

import com.product.jpa.demo.Entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void saveData() {
        Department itDepartment = Department.builder()
                .name("IT")
                .location("A Side")
                .build();
        Department computerDepartment = Department.builder()
                .name("Computer")
                .location("B Side")
                .build();

        departmentRepository.saveAll(List.of(itDepartment, computerDepartment));
    }

    @Test
    public void printFindById() {
        List<Department> department =
                departmentRepository.findDepartmentByDepartmentId(1);

        System.out.println("Department : " + department);
    }

    @Test
    public void printPrintByName() {
        List<Department> department =
                departmentRepository.findDepartmentByName("IT");

        System.out.println("Department with Name : " + department);
    }

    @Test
    public void printPrintByNameContaining() {
        List<Department> department =
                departmentRepository.findDepartmentByNameContaining("C");

        System.out.println("Department with Name Containing : " + department);
    }
}