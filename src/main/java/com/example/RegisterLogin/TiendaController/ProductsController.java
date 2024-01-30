package com.example.RegisterLogin.TiendaController;

import com.example.RegisterLogin.Dto.ProductDto;
import com.example.RegisterLogin.Entity.Producto;
import com.example.RegisterLogin.Entity.ProductoSales;
import com.example.RegisterLogin.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/store")
public class ProductsController {
    @Autowired
    IProductService iProductService;
    @GetMapping(path = "/findAll")
    public ResponseEntity<List<Producto>> listarProduct() {
        return iProductService.listarProduct();
    }
    @PostMapping(path = "/save/{action}")
    public ResponseEntity<Object> saveToCartProduct(@RequestBody ProductDto request, @PathVariable String action) {
        return iProductService.saveToCartProduct(request, action);
    }

    @GetMapping(path = "/findAll/{category}")
    public ResponseEntity<List<ProductoSales>> productsSales(@PathVariable String category) {
        return iProductService.productsSales(category);
    }



}
