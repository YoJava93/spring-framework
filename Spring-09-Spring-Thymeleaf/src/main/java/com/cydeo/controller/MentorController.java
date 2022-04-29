package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model) {

        model.addAttribute("mentor", new Mentor());

        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3", "JD3");
        model.addAttribute("batchList", batchList);
        Set<Integer> set = new HashSet<>();

        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor, Model model) {

        System.out.println(mentor.toString());

        //return "mentor/mentor-confirmation";
        return "redirect:/mentor/register";
    }



}
