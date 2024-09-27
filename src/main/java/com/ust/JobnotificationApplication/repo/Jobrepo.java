package com.ust.JobnotificationApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.JobnotificationApplication.model.Jobnotification;
@Repository
public interface Jobrepo extends JpaRepository<Jobnotification, Integer> {

}
