package com.dept.repository;
import com.dept.entity.DepartMent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartMent, Long>
{
    DepartMent findByDepartmentCode(String departmentCode);
}