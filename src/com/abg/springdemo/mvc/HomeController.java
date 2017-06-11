package com.abg.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by maxim on 5/30/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome() {
        return "main-menu";
    }

    @RequestMapping("showForm")
    public String showForm() {
        return "showForm";
    }

    @RequestMapping("processForm")
    public String processForm() {
        return "processForm";
    }

    @RequestMapping("processFormV2")
    public String processFormV2(ServletWebRequest request, Model model) {

        String studentName = request.getParameter("studentName");
        String newStudentName = "Yo" + studentName;

        model.addAttribute("newStudentName", newStudentName);
        return "processFormV2";

    }
}