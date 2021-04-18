package com.company.name.basics.intrface;

import com.company.name.dto.Shipping;

public interface IShipping {

    public Shipping getShippingInfo(String prodId);

    default int sum(int a , int b){
        return a + b;
    }
}
