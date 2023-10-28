package com.moonshade.productservice.service.impl;

import com.moonshade.productservice.dto.ProductResponse;
import com.moonshade.productservice.dto.Products;
import com.moonshade.productservice.model.Product;
import com.moonshade.productservice.repository.ProductRepository;
import com.moonshade.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepository productRepository;

    @Override
    public Products getAllProducts() {
        return new Products(productRepository.findAll());
    }

}
