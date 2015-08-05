/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.onlineshopping.entity;

/**
 *
 * @author Anuz
 */
public class OccasionalProduct {

    private int occasionId;
    private int productId;
    
    public OccasionalProduct() {
    }

    public int getOccasionId() {
        return occasionId;
    }

    public void setOccasionId(int occasionId) {
        this.occasionId = occasionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "OccasionalProduct{" + "occasionId=" + occasionId + ", productId=" + productId + '}';
    }
    
    
}
