package com.example.controller;

import com.example.entity.Sms;
import com.example.entity.sms.Failed;
import com.example.entity.sms.Inbox;
import com.example.entity.sms.Sent;
import com.example.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
public class ServiceController {

    @Autowired
    private SmsService smsService;

    @GetMapping("/get")
    public String get(){
        return "Start";
    }

    @PostMapping("/addToInbox")
    public Inbox addToInbox(@RequestBody Inbox inbox){
        return smsService.addToInbox(inbox);
    }

    @PostMapping("/addToSent")
    public Sent addToSent(@RequestBody Sent sent){
        return smsService.addToSent(sent);
    }

    @PostMapping("/addToFailed")
    public Failed addToFailed(@RequestBody Failed failed){
        return smsService.addToFailed(failed);
    }
}
