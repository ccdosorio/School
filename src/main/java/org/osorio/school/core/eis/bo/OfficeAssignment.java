package org.osorio.school.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "office_assignment")
public class OfficeAssignment implements Serializable {

    @Id
    @Column(name = "instructor_id")
    private Long instructorId;
    @Column(name = "location")
    private String location;
    @Column(name = "times_tamp")
    private Timestamp timesTamp;
    @OneToOne(optional = false, mappedBy = "officeAssignment")
    private Person person;
}
