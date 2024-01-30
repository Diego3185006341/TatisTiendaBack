package com.example.RegisterLogin.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UsuarioDto {


    private Integer userId;


    private String name;



    private String lastName;


    private String identificationNumber;


    private String phone;


    private String address;


    private String email;

    private String password;

}
