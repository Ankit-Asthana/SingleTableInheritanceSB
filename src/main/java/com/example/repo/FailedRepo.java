package com.example.repo;

import com.example.entity.sms.Failed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FailedRepo extends JpaRepository<Failed,Integer> {

}
