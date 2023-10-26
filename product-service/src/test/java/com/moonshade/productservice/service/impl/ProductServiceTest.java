package com.moonshade.productservice.service.impl;

import com.moonshade.productservice.dto.ProductResponse;
import com.moonshade.productservice.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


public class ProductServiceTest {

    @Test
    void should_retrieve_list_of_productResponse (){
        ProductService productService = new ProductServiceImpl();
        List<ProductResponse> expectedProductResponse = productService.getAllProducts();
        List<ProductResponse> actualProuctResponse = new ArrayList<>();
        Assertions.assertTrue(List.of(expectedProductResponse).equals(actualProuctResponse));
    }
}
