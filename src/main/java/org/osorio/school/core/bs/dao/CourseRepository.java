package org.osorio.school.core.bs.dao;

import org.osorio.school.core.eis.bo.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}

