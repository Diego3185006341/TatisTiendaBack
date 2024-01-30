package com.example.RegisterLogin.Repository;

import com.example.RegisterLogin.Entity.ProductoSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ProductSalesRepository extends JpaRepository<ProductoSales, Integer> {
}
