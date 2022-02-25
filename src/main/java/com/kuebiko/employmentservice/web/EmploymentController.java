package com.kuebiko.employmentservice.web;

import com.kuebiko.employmentservice.models.Employment;
import com.kuebiko.employmentservice.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/employment")
public class EmploymentController {

    @Autowired
    EmploymentService employmentService;

    @GetMapping
    @RequestMapping("/find") //http://localhost:8085/v1/employment/find?id=1
    public Employment findById(@RequestParam("id")Long id){
        return employmentService.find(id);
    }

    @GetMapping
    @RequestMapping("/{id}/find") //http://localhost:8085/v1/employment/1/find
    public Employment find(@PathVariable("id")Long id) {
        return employmentService.find(id);
    }

    @PostMapping
    @RequestMapping("/save")
    public Employment find(@RequestBody Employment payload) throws Exception {
        return employmentService.save(payload);
    }
}
