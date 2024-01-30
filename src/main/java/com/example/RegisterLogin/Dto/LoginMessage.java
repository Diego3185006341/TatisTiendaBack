package com.example.RegisterLogin.Dto;

import lombok.*;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class LoginMessage {


    private String Message;
    private boolean Status;
}