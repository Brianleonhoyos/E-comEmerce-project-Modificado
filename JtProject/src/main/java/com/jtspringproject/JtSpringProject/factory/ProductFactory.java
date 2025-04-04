package com.jtspringproject.JtSpringProject.factory;

import com.jtspringproject.JtSpringProject.models.Category;
import com.jtspringproject.JtSpringProject.models.Product;

public class ProductFactory {
    public static Product createProduct(String name, int price, int quantity, int weight, String description, String image, Category category) {
        return new Product.Builder()
                .setName(name)
                .setPrice(price)
                .setQuantity(quantity)
                .setWeight(weight)
                .setDescription(description)
                .setImage(image)
                .setCategory(category)
                .build();
    }
}
