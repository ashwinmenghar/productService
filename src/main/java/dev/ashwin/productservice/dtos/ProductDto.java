package dev.ashwin.productservice.dtos;

import dev.ashwin.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    private String title;
    private double price;
    private String description;
    private String imageUrl;
    private Category category;
}
