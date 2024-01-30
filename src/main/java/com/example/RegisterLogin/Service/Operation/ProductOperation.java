package com.example.RegisterLogin.Service.Operation;

import com.example.RegisterLogin.Dto.ProductDto;
import com.example.RegisterLogin.Entity.Producto;
import com.example.RegisterLogin.Entity.ProductoSales;
import com.example.RegisterLogin.Repository.ProductRepository;
import com.example.RegisterLogin.Repository.ProductSalesRepository;
import com.example.RegisterLogin.Service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.example.RegisterLogin.Crosscutting.Constants.AUTHORIZED;
import static com.example.RegisterLogin.Crosscutting.Constants.PENDING;

@Service
@Slf4j
public class ProductOperation implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductSalesRepository productSalesRepository;


    @Override
    public ResponseEntity<List<Producto>> listarProduct() {
        try {


            List<Producto> product = new ArrayList<Producto>(productRepository.findAll());

            return new ResponseEntity<>(product, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Object> saveToCartProduct(ProductDto request, String action) {
        Integer statusId = null;

        if(Objects.equals(action, PENDING)){
            statusId = 1;
        }
        if(Objects.equals(action, AUTHORIZED)) {
            statusId = 2;
            Producto byId = productRepository.findById(request.getIdProductos()).orElse(null);
            int currentAmount = Integer.parseInt(byId.getProductosCantidad());
            int newAmmount = currentAmount - Integer.parseInt(request.getProductosCantidad());
            byId.setProductosCantidad(Integer.toString(newAmmount));
            productRepository.save(byId);
        }

        ProductoSales productoSales = ProductoSales.builder().idProductos(request.getIdProductos())
                .nomProductos(request.getNomProductos()).productosPrecio(request.getProductosPrecio())
                .productosCantidad(request.getProductosCantidad()).image(request.getImage()).statusId(statusId).build();

        productSalesRepository.save(productoSales);
        return new ResponseEntity<>(productoSales,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<ProductoSales>> productsSales(String category) {
        try {


            List<ProductoSales> product = new ArrayList<>(productSalesRepository.findAll());

            List<ProductoSales> initialProduct = product.stream().filter(p -> p.getStatus().getKey().equals(category))
                    .toList();
            return new ResponseEntity<>(initialProduct, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
