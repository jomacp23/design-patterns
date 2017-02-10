package com.accenture.patterns.facade.service;

import com.accenture.patterns.facade.model.Product;

public class InventoryService {
    public static boolean isAvailable(Product product){
        /*Check Warehouse database for product availability*/
    	System.out.println("InventoryService is available");
        return true;
    }
}
