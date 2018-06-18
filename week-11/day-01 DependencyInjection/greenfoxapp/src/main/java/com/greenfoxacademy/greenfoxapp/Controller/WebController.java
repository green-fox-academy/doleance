package com.greenfoxacademy.greenfoxapp.Controller;

import com.greenfoxacademy.greenfoxapp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String addStudentForm() {
        return "gfa/add";
    }

    @PostMapping("/gfa/add")
    public String addStudent(@ModelAttribute(value = "name") String studentName) {
        System.out.println(studentName);
        studentService.save(studentName);
        return "redirect:/gfa/list";
    }

    @GetMapping("/gfa/check")
    public String findingStudent(@RequestParam(value = "studentName", required = false) String studentName, Model model) {
        model.addAttribute("studentName", studentName);
        model.addAttribute("isStudentFound",studentService.findStudent(studentName));
        return "gfa/check";
    }

    @PostMapping("/gfa/check")
    public String lookingForStudent(@ModelAttribute(value = "name") String studentName) {
        return "redirect:/gfa/check?name=" + studentName;
    }

}
