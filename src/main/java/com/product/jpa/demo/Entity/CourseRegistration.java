package com.product.jpa.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CourseRegistration {

    @Id
    @SequenceGenerator(
            name = "course_register_sequence",
            sequenceName = "course_register_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "course_register__sequence"
    )
    private int courseRegistrationId;

    @ManyToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "studentId"
    )
    private Student student;

    private Long grade;
}
