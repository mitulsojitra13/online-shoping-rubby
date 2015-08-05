/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.onlineshopping.entity;

import java.util.Date;

/**
 *
 * @author Anuz
 */
public class View {
    private int viewId;
    private Date time;
    private String ipAddress;
    private int productId;

    public View() {
    }

    public int getViewId() {
        return viewId;
    }

    public void setViewId(int viewId) {
        this.viewId = viewId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "View{" + "viewId=" + viewId + ", time=" + time + ", ipAddress=" + ipAddress + ", productId=" + productId + '}';
    }
    
    
}
