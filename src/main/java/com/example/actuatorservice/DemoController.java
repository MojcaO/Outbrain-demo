package com.example.actuatorservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class DemoController {

    private TeacherRepository teacherRepository;

    public DemoController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @GetMapping("test") //http://localhost:8080/api/test?name=blabla
    public String testEndpoint(@RequestParam String name) {
        return "Hello "+name;
    }

    @GetMapping("test2")
    public DemoType testEndpoint2() {
        return new DemoType("test", 123);
    }

    @PostMapping("test3")
    public String testEndpoint3(@RequestBody DemoType input) {
        return input.getField1();
    }

    @GetMapping("test4") //teacher
    public Teacher teacherEndpoint() {
        Teacher teacher = new Teacher(1, "Random name", "Random email");
        teacherRepository.save(teacher);

        return teacherRepository.findById(1).get();
    }

    @GetMapping("maketeachers") //teacher
    public Teacher[] makeTeachersEndpoint() {
        for (int i=0;i<10;i++) {
            Teacher teacher = new Teacher(i, "name"+i, i+"@teacherRepository");
            teacherRepository.save(teacher);
        }

        Teacher[] teachers = teacherRepository.findAll().toArray(new Teacher[0]);
        return teachers;
    }

    @GetMapping("teachers") //teacher
    public Teacher[] allTeachersEndpoint() {

        Teacher[] teachers = teacherRepository.findAll().toArray(new Teacher[0]);
        return teachers;
    }

    @PostMapping("addteacher")
    public String addTeacherEndpoint(@RequestBody Teacher input) {

        teacherRepository.save(input);
        return "Added "+input.getName();
    }

    @GetMapping("clearteachers")
    public String clearTeachersEndpoint() {
        teacherRepository.deleteAll();
        return "Cleared teachers.";
    }

    @GetMapping("error")
    public String error() {
        return "error!";
    }
}
