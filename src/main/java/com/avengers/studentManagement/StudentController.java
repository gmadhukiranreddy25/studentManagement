package com.avengers.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();


    //get information

    // Reeuest Param
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int admnNo){
        return db.get(admnNo);
    }

//        // Path Variable
//    @GetMapping("/get_student/{admnNo}")
//    public Student getStudent(@PathVariable("admnNo") int admnNO){
//        return db.get(admnNO);
//    }






    //adding the informaton
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        int admnNo = student.getAdmnNo();
        db.put(admnNo,student);
        return "Student added successfully";

    }


}
