package dev.ashwin.productservice.services;

public interface CategoryService {
    String getAllCategories();
    String getProductsInCategory(Long categoryId);
}
