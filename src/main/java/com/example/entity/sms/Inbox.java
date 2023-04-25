package com.example.entity.sms;

import com.example.entity.Sms;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
@DiscriminatorValue(value = "inbox_type")
public class Inbox extends Sms {
//    @Column(name = "smstype")
    private String smstype;

//    @Override
//    public String toString() {
//        return "Inbox{" +
//                "smstype='" + smstype + '\'' +
//                '}';
//    }
    public String getSmstype(){
        return smstype;
    }

    public void setSmstype(String smstype){
        this.smstype=smstype;
    }
}
