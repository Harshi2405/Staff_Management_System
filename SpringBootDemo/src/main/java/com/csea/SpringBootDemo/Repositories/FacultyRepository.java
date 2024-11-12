package com.csea.SpringBootDemo.Repositories;

import com.csea.SpringBootDemo.Entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
    List<Faculty> findByFacultyName(String name);
}

