package com.greenfoxacademy.greenfoxapp.Controller;

import com.greenfoxacademy.greenfoxapp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    StudentService studentService;

    @GetMapping("/gfa")
    public String mainPage(Model model) {
        model.addAttribute("counter", studentService.count());
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String getStudentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "gfa/list";
    }

    @GetMapping("/gfa/add")
    public String addStudent(Model model) {

        return "gfa/add";
    }

}
