package com.accenture.patterns.facade;

import com.accenture.patterns.facade.model.Product;
import com.accenture.patterns.facade.service.InventoryService;
import com.accenture.patterns.facade.service.PaymentService;
import com.accenture.patterns.facade.service.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade{

    public boolean placeOrder(int pId){
        boolean orderFulfilled=false;
        Product product=new Product();
        product.productId=pId;
        
        if(InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId+" is available.");
            boolean paymentConfirmed= PaymentService.makePayment();
            
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                
                System.out.println("Product shipped...");
                
                orderFulfilled=true;
            }
        }
        return orderFulfilled;
    }
}
