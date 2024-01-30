package com.example.RegisterLogin.Dto;

import com.example.RegisterLogin.Entity.Status;
import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {


    private Integer idProductos;

    private String nomProductos;

    private String productosPrecio;

    private String productosCantidad;

    private Status status;

    private String image;

    private Integer statusId;
}
