package com.example.repo;

import com.example.entity.sms.Inbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InboxRepo extends JpaRepository<Inbox,Integer> {
}
