package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
//Data可能會錯
@Data
@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String username;
    @Column
    private String password;


}
