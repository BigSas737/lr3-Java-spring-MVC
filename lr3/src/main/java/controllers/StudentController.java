package controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import students.Student;
@Controller
public class StudentController {

    public StudentService service;


    @Autowired
    public void setService(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    @PostMapping("/add_student")
    public String greetingSubmit(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }
}




