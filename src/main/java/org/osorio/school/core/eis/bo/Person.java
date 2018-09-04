package org.osorio.school.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "hire_date")
    private Date hireDate;
    @Column(name = "enrollment_date")
    private Date enrollmentDate;
    @OneToMany(mappedBy = "person")
    private Set<CourseInstructor> courseInstructors;
    @OneToMany(mappedBy = "person")
    private Set<StudentGrade> studentGrades;
    @OneToOne(optional = false)
    @JoinColumn(name="instructor_id", unique=true, nullable=false, updatable=false)
    private OfficeAssignment officeAssignment;

}
