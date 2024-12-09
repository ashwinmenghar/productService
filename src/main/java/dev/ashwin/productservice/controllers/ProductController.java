package dev.ashwin.productservice.controllers;

import dev.ashwin.productservice.dtos.ProductDto;
import dev.ashwin.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public String getAllProducts() {
        return "Get All Products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId) {
        return "Get Single Product";
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto product) {
        return "Add New Product";
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {
        return "Update Product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Delete Product";
    }
}
