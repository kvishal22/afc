package com.kanna.afc.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyTeams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String teamName;
    private String email;
    private int contactNumber;

}