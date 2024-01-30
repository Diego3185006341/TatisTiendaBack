package com.example.RegisterLogin.Repository;

import com.example.RegisterLogin.Entity.Producto;
import com.example.RegisterLogin.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Producto, Integer> {
}
