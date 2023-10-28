package com.moonshade.productservice.service.impl;

import com.moonshade.productservice.dto.ProductResponse;
import com.moonshade.productservice.dto.Products;
import com.moonshade.productservice.model.Money;
import com.moonshade.productservice.model.Product;
import com.moonshade.productservice.repository.ProductRepository;
import com.moonshade.productservice.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {


    @Mock
    private ProductRepository productRepository;

    @Test
    void should_retrieve_list_of_productResponse (){


        String productId = "1L";
        Money productPrice = new Money(new BigInteger("5000"));
        String productDescription = "This is a product";
        String productName = "Alpha";
        Product product = new Product(productId, productName, productPrice, productDescription);

        Products actualProductResponse = new Products(Arrays.asList(product));
        Mockito.when(productRepository.findAll()).thenReturn(Arrays.asList(product));

        ProductService productService = new ProductServiceImpl(productRepository);
        Products expectedProductResponse = productService.getAllProducts();
        

        Assertions.assertTrue(expectedProductResponse.equals(actualProductResponse));
    }
}
