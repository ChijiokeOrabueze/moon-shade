package com.moonshade.productservice.model;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Data
@Document
@AllArgsConstructor
public class Product {

    @Id
    private  String id;
    private String name;
    private Money price;
    private  String description;
}
