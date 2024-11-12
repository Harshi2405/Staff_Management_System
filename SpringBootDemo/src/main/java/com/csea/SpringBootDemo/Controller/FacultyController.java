package com.csea.SpringBootDemo.Controller;

import com.csea.SpringBootDemo.Entity.Faculty;
import com.csea.SpringBootDemo.Services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @PostMapping("/save")
    public Faculty save(@RequestBody Faculty faculty)
    {
        return facultyService.save(faculty);
    }

    @GetMapping("/fetchAll")
    public List<Faculty> fetchAll()
    {
        return facultyService.fetchAll();
    }

    @GetMapping("/fetchById/{id}")
    public Faculty fetchById(@PathVariable("id") Long facultyId)
    {
        return facultyService.fetchById(facultyId);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteByFacultyId(@PathVariable("id") Long facultyId)
    {
        facultyService.deleteByFacultyId(facultyId);
        return "Success";
    }

    @PostMapping("/fetchByFacultyName")
    public List<Faculty> fetchByFacultyName(@RequestBody String name){
        return facultyService.fetchByFacultyName(name);
    }
}
