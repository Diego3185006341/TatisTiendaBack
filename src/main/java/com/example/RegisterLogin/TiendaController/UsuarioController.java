package com.example.RegisterLogin.TiendaController;

import com.example.RegisterLogin.Dto.LoginDto;
import com.example.RegisterLogin.Dto.LoginMessage;
import com.example.RegisterLogin.Dto.LoginResponse;
import com.example.RegisterLogin.Dto.UsuarioDto;
import com.example.RegisterLogin.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/store")

public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;


    @PostMapping(path = "/save")
    public ResponseEntity<Object> saveRegistroTienda(@RequestBody UsuarioDto usuarioDTO) {

        return usuarioService.agregarUsuarios(usuarioDTO);


    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> LoginTienda(@RequestBody LoginDto loginDto) {

        LoginResponse loginMessage= usuarioService.LoginUsuarios(loginDto);
        return ResponseEntity.ok(loginMessage);


    }

}
