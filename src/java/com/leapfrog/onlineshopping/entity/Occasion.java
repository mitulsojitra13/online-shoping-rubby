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
public class Occasion {
    private int occasionId;
    private String occasionName;
    private Date occasionDate;
    private Date startDate;
    private Date endDate;

    public Occasion() {
    }

    public int getOccasionId() {
        return occasionId;
    }

    public void setOccasionId(int occasionId) {
        this.occasionId = occasionId;
    }

    public String getOccasionName() {
        return occasionName;
    }

    public void setOccasionName(String occasionName) {
        this.occasionName = occasionName;
    }

    public Date getOccasionDate() {
        return occasionDate;
    }

    public void setOccasionDate(Date occasionDate) {
        this.occasionDate = occasionDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Occasion{" + "occasionId=" + occasionId + ", occasionName=" + occasionName + ", occasionDate=" + occasionDate + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
    
}
