package org.osorio.school.core.bs.dao;

import org.osorio.school.core.eis.bo.Department;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {
    
}
