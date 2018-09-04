package org.osorio.school.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "department")
public class Department implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    private Long departmentId;
    @Column(name = "name")
    private String name;
    @Column(name = "bugdet")
    private Double budget;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE) //Solo trae la fecha
    private Date startDate;
    @Column(name = "administrator")
    private Integer administrator;

    @OneToMany(mappedBy = "department")
    private Set<Course> courses;
}
