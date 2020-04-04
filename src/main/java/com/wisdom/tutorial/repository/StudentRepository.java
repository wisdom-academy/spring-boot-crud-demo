package com.wisdom.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wisdom.tutorial.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
