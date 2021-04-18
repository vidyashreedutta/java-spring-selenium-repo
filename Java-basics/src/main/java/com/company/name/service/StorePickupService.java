package com.company.name.service;

import com.company.name.basics.intrface.IShipping;
import com.company.name.dto.Shipping;

public class StorePickupService implements IShipping {
    @Override
    public Shipping getShippingInfo(String prodId) {
        Shipping shipping = new Shipping();
        shipping.setStorePickup(false);
        return shipping;

    }
}
