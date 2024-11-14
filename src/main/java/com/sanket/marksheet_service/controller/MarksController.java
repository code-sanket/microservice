package com.sanket.marksheet_service.controller;

import com.sanket.marksheet_service.entity.Marks;
import com.sanket.marksheet_service.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/marks")
public class MarksController {

    @Autowired
    private MarksService marksService;

    @GetMapping("/getMarks/{id}")
   ResponseEntity<Marks> getMarks(@PathVariable("id")String id){
        Marks marks =  marksService.getMarks(id);
        return ResponseEntity.ok(marks);
    }
}
