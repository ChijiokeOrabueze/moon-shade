package com.moonshade.productservice.model;

import com.moonshade.productservice.customtype.MoneyUnit;
import lombok.RequiredArgsConstructor;

import java.math.BigInteger;

@RequiredArgsConstructor
public class Money {

    private final MoneyUnit unit = MoneyUnit.USD;
    private final BigInteger value;
}
