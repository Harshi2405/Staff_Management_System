package com.csea.SpringBootDemo.Services;

import com.csea.SpringBootDemo.Entity.Faculty;

import java.util.List;

public interface FacultyService {
    Faculty save(Faculty faculty);

    List<Faculty> fetchAll();

    Faculty fetchById(Long facultyId);

    void deleteByFacultyId(Long facultyId);

    List<Faculty> fetchByFacultyName(String name);
}
