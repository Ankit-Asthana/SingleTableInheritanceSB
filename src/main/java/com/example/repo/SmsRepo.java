package com.example.repo;

import com.example.entity.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepo extends JpaRepository<Sms,Integer > {
}
