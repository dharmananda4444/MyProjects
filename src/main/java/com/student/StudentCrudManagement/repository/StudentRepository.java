package com.student.StudentCrudManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.StudentCrudManagement.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> 
{

}
