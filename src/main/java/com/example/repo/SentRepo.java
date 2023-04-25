package com.example.repo;

import com.example.entity.sms.Sent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentRepo extends JpaRepository<Sent,Integer> {
}
