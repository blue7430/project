package com.example.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private UUID UserID;
    private String TopFacter1;
    private String TopFacter2;
    private String TopFacter3;
    private String TopFacter4;
    private String TopFacter5;
}
