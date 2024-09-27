package com.ust.JobnotificationApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.JobnotificationApplication.model.Jobnotification;
import com.ust.JobnotificationApplication.service.JobnotificationService;


@RestController
@RequestMapping("/ust")

public class JobnotificationController {

    @Autowired
    private JobnotificationService service;

    @PostMapping("/addjobnotification")
    public Jobnotification addjobnotification(@RequestBody Jobnotification info) {
        return service.addjobnotification(info);
        
    }

    @GetMapping("/getjobnotification")
    public List<Jobnotification> getjobnotification() {
        return service.getjobnotification();
    }

    @GetMapping("/getjobnotification/{id}")
    public Jobnotification getjobnotificationById(@PathVariable("id") int jobId) {
        return service.getjobnotificationById(jobId);
    }

    @DeleteMapping("/deletejobnotification/{id}")
    public String deletejobnotificationById(@PathVariable("id") int jobId) {
        service.deletejobnotificationById(jobId);
        return "deleted job notification with id: " + jobId;
    }
}