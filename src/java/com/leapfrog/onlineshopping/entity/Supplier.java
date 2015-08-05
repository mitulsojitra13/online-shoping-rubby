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
public class Supplier {
    private int supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierContactNo;
    private String supplierEmail;
    private String supplierCoordinator;
    private int productId;

    public Supplier() {
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierContactNo() {
        return supplierContactNo;
    }

    public void setSupplierContactNo(String supplierContactNo) {
        this.supplierContactNo = supplierContactNo;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierCoordinator() {
        return supplierCoordinator;
    }

    public void setSupplierCoordinator(String supplierCoordinator) {
        this.supplierCoordinator = supplierCoordinator;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Supplier{" + "supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress=" + supplierAddress + ", supplierContactNo=" + supplierContactNo + ", supplierEmail=" + supplierEmail + ", supplierCoordinator=" + supplierCoordinator + ", productId=" + productId + '}';
    }
    
    
}
