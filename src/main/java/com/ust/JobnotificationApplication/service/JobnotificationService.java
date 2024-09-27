package com.ust.JobnotificationApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.JobnotificationApplication.model.Jobnotification;
import com.ust.JobnotificationApplication.repo.Jobrepo;

@Service
public class JobnotificationService {
    @Autowired
    private Jobrepo repo;
    public Jobnotification addjobnotification(Jobnotification info) {
        return repo.save(info);
    }

    public List<Jobnotification> getjobnotification() {
        return repo.findAll();
    }

    public Jobnotification getjobnotificationById(int jobId) {
        return repo.findById(jobId).get();
    }

    public void deletejobnotificationById(int jobId) {
        repo.deleteById(jobId);
    }
}
