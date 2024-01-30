package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.LoginDto;
import com.example.RegisterLogin.Dto.LoginMessage;
import com.example.RegisterLogin.Dto.LoginResponse;
import com.example.RegisterLogin.Dto.UsuarioDto;
import org.springframework.http.ResponseEntity;

public interface IUsuarioService {
    ResponseEntity<Object> agregarUsuarios(UsuarioDto usuarioDTO);

    LoginResponse LoginUsuarios(LoginDto loginDto);
}
