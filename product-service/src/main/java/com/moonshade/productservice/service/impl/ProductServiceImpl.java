package com.moonshade.productservice.service.impl;

import com.moonshade.productservice.dto.ProductResponse;
import com.moonshade.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductResponse> getAllProducts() {
        return null;
    }
}
