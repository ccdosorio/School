package org.osorio.school.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "course")
@Inheritance(strategy = InheritanceType.JOINED)
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long courseId;
    @Column(name = "title")
    private String title;
    @Column(name = "credits")
    private Integer credits;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;
    @OneToMany(mappedBy = "course")
    private Set<StudentGrade> studentGrades;
    @OneToMany(mappedBy = "course")
    private Set<CourseInstructor> courseInstructors;


}
