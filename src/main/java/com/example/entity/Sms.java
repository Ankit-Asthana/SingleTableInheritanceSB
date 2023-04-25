package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "sms")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "smsfolder",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "sms_type")
public class Sms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "fromorto")
    private String fromorto;
    @Column(name = "messagetext")
    private String messagetext;
    @Column(name = "sentorrecievedon")
    private ZonedDateTime sentorrecievedon;

//    @Override
//    public String toString() {
//        return "Sms{" +
//                "id=" + id +
//                ", fromorto='" + fromorto + '\'' +
//                ", messagetext='" + messagetext + '\'' +
//                ", sentorrecievedon=" + sentorrecievedon +
//                '}';
//    }
}
