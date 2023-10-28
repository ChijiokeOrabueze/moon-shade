package com.moonshade.productservice.dto;


import com.moonshade.productservice.model.Money;
import com.moonshade.productservice.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.math.BigInteger;

@Data
@Builder
@AllArgsConstructor
public class ProductResponse {

    private  String id;
    private String name;
    private Money price;
    private  String description;

    public static ProductResponse mapFromProduct (Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .build();
    }
}
