package com.moonshade.productservice.service;

import com.moonshade.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getAllProducts();
}
