package com.example.RegisterLogin.Repository;

import com.example.RegisterLogin.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findOneByEmailAndPassword(String email, String password);
}
