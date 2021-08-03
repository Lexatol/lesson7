package ru.geekbrains.lesson7.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.lesson7.entities.Student;
import ru.geekbrains.lesson7.services.StudentService;

import java.util.List;

@RestController
@RequestMapping ("/find")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/")
    public List<Student> showAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student showById(@PathVariable Long id) {
        return studentService.findById(id).orElseThrow();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        student.setId(null);
        return studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.delete(id);
    }
}
