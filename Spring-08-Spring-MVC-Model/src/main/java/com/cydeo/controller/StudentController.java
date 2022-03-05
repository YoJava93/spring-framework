package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "JavaDeveloper");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        //create some random student ID and show it in your UI
        model.addAttribute("id", new Random().nextInt());

        List<Integer> numbers = Arrays.asList(12,34,23,412,123213,12,31,23,2);
        model.addAttribute("numbers", numbers);
        model.addAttribute("numbers", numbers);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);

        return "/student/welcome";
    }

}
