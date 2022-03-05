package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/mentor1")
    public String page1(Model model) {

        Mentor mentor1 = new Mentor("Mike", "Smith", 45);
        model.addAttribute("firstName1", mentor1.getFirstName());
        model.addAttribute("lastName1", mentor1.getLastName());
        model.addAttribute("age1", mentor1.getAge());
        model.addAttribute("gender1", Gender.MALE);

        Mentor mentor2 = new Mentor("Tom", "Hanks", 65);
        model.addAttribute("firstName2", mentor2.getFirstName());
        model.addAttribute("lastName2", mentor2.getLastName());
        model.addAttribute("age2", mentor2.getAge());
        model.addAttribute("gender2", Gender.MALE);

        Mentor mentor3 = new Mentor("Ammy", "Bryan", 25);
        model.addAttribute("firstName3", mentor3);
        model.addAttribute("lastName3", mentor3);
        model.addAttribute("age3", mentor3);
        model.addAttribute("gender3", Gender.FEMALE);

        return "/student/student";
    }
}
