package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.ProductDto;
import com.example.RegisterLogin.Entity.Producto;
import com.example.RegisterLogin.Entity.ProductoSales;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductService {

    public ResponseEntity<List<Producto>> listarProduct();

    public ResponseEntity<Object> saveToCartProduct(ProductDto request, String action);

    public ResponseEntity<List<ProductoSales>> productsSales(String category);

}
