package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTS_SALE")
public class ProductoSales {

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

    @ManyToOne
    @JoinColumn(name = "STATUS_ID", nullable = false, insertable = false, updatable = false)
    private Status status;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "STATUS_ID")
    private Integer statusId;
}
