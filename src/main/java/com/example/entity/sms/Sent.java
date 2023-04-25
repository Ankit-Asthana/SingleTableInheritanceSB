package com.example.entity.sms;

import com.example.entity.Sms;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
//@Getter
//@Setter
@DiscriminatorValue(value = "sent_type")
public class Sent extends Sms {
  //  @Column(name = "deliveredon")
    private ZonedDateTime deliveredon;

    public void setDeliveredon(ZonedDateTime deliveredon){
      this.deliveredon=deliveredon;
    }
    public ZonedDateTime getDeliveredon() {
       return deliveredon;
    }
}
