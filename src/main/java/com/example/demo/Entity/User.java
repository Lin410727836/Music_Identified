package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
//user資料表欄位的類別
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
