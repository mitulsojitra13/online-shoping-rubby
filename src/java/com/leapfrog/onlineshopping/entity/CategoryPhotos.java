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
public class CategoryPhotos {
    private int categoryPhotoId;
    private int categoryId;
    private String categoryPhonePath;

    public CategoryPhotos() {
    }

    public int getCategoryPhotoId() {
        return categoryPhotoId;
    }

    public void setCategoryPhotoId(int categoryPhotoId) {
        this.categoryPhotoId = categoryPhotoId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryPhonePath() {
        return categoryPhonePath;
    }

    public void setCategoryPhonePath(String categoryPhonePath) {
        this.categoryPhonePath = categoryPhonePath;
    }

    @Override
    public String toString() {
        return "CategoryPhotos{" + "categoryPhotoId=" + categoryPhotoId + ", categoryId=" + categoryId + ", categoryPhonePath=" + categoryPhonePath + '}';
    }
    
    
}
