package com.example.RegisterLogin.Dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String Message;
    private boolean Status;
}
