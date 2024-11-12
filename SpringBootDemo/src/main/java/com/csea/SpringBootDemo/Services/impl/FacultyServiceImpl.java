package com.csea.SpringBootDemo.Services.impl;

import com.csea.SpringBootDemo.Entity.Faculty;
import com.csea.SpringBootDemo.Repositories.FacultyRepository;
import com.csea.SpringBootDemo.Services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public Faculty save(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public List<Faculty> fetchAll() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty fetchById(Long facultyId) {
        return facultyRepository.findById(facultyId).get();
    }

    @Override
    public void deleteByFacultyId(Long facultyId) {
        facultyRepository.deleteById(facultyId);
    }

    @Override
    public List<Faculty> fetchByFacultyName(String name) {
        return facultyRepository.findByFacultyName(name);
    }
}
