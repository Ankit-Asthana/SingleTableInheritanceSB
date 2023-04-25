package com.example.entity.sms;

import com.example.entity.Sms;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
@DiscriminatorValue(value = "failed_type")
public class Failed extends Sms {
    @Column(name = "errormessage")
    private String errormessage;

    public String getErrormessage(){
        return errormessage;
    }

    public void setErrormessage(String errormessage){
        this.errormessage=errormessage;
    }
}
