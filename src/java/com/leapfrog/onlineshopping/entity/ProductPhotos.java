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
public class ProductPhotos {
    private int productPhotoId;
    private String productPhotoPath;
    private int productId;

    public ProductPhotos() {
    }

    public int getProductPhotoId() {
        return productPhotoId;
    }

    public void setProductPhotoId(int productPhotoId) {
        this.productPhotoId = productPhotoId;
    }

    public String getProductPhotoPath() {
        return productPhotoPath;
    }

    public void setProductPhotoPath(String productPhotoPath) {
        this.productPhotoPath = productPhotoPath;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductPhotos{" + "productPhotoId=" + productPhotoId + ", productPhotoPath=" + productPhotoPath + ", productId=" + productId + '}';
    }
    
    
}
