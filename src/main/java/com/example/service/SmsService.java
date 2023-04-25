package com.example.service;

import com.example.entity.Sms;
import com.example.entity.sms.Failed;
import com.example.entity.sms.Inbox;
import com.example.entity.sms.Sent;
import com.example.repo.FailedRepo;
import com.example.repo.InboxRepo;
import com.example.repo.SentRepo;
import com.example.repo.SmsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
    @Autowired
    private SmsRepo smsRepo;
    @Autowired
    private InboxRepo inboxRepo;
    @Autowired
    private FailedRepo failedRepo;
    @Autowired
    private SentRepo sentRepo;

    public Inbox addToInbox(Inbox inbox) {
        System.out.println("-----------------------------" +inbox.toString() );

        return smsRepo.save(inbox);
    }

    public  Sent addToSent(Sent sent) {
        return sentRepo.save(sent);
    }

    public Failed addToFailed(Failed failed) {
        return failedRepo.save(failed);
    }

}
