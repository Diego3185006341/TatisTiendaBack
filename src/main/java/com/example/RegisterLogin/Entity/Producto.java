package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTS")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PRODUCTS", unique = true)
    private Integer idProductos;

    @Column(name = "NAME_PRODUCTS")
    private String nomProductos;

    @Column(name = "PRICE")
    private String productosPrecio;

    @Column(name = "AMOUNT")
    private String productosCantidad;

    @Column(name = "IMAGE")
    private String image;

}