package com.moonshade.productservice.dto;

import com.moonshade.productservice.model.Product;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;



public class Products {
    private List<ProductResponse> products;

    public Products (List<Product> products){
        this.products = products
                .stream()
                .map(product -> ProductResponse.mapFromProduct(product))
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products products1)) return false;
        if (products.size() != products1.products.size()) return false;
//        return products1.products.stream().allMatch(this::isInProducts);
        return Objects.equals(products, products1.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    private boolean isInProducts (ProductResponse product){
        return products.stream().anyMatch(productResponse -> productResponse.equals(productResponse));
    }
}
