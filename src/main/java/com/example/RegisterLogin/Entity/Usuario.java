package com.example.RegisterLogin.Entity;


import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIOS")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "USER_ID", unique = true)
    private Integer userId;


    @Column(name = "NAME")
    private String name;


    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "IDENTIFICATION_NUMBER")
    private String identificationNumber;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;




}
