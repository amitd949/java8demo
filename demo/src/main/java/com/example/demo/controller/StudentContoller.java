package com.example.demo.controller;

import com.example.demo.controller.aop.StudentService;
import com.example.demo.controller.aop.Timed1;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@ExternalDocumentation(description = "Student class ")
public class StudentContoller {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/hello")
    @Operation(description = "this is test ")
    @Timed1
    public String getWelcomeNote() {
        try {
            //Thread.sleep(1000);
            studentService.parseAndProcess();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Calling rest controller");
        return "welcome to the rest application";
    }

}

