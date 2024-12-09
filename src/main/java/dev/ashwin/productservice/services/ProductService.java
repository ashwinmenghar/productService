package dev.ashwin.productservice.services;

import org.springframework.web.bind.annotation.*;

public interface ProductService {
    String getAllProducts();

    String getSingleProduct(Long productId);

    String addNewProduct();

    String updateProduct(Long productId);

    String deleteProduct(Long productId);
}
