package com.company.name.dto;

public class Shipping {

  private  boolean onlineShipping;
  private boolean storePickup;

    public boolean isOnlineShipping() {
        return onlineShipping;
    }

    public void setOnlineShipping(boolean onlineShipping) {
        this.onlineShipping = onlineShipping;
    }

    public boolean isStorePickup() {
        return storePickup;
    }

    public void setStorePickup(boolean storePickup) {
        this.storePickup = storePickup;
    }
}
