package com.project.people.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.people.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
