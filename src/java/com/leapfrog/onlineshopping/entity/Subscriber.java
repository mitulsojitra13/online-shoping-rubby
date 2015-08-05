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
public class Subscriber {
    private int subscriberId;
    private String subscriberEmail;
    private Boolean unsubscribe;
    private Date subscribedDate;

    public Subscriber() {
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberEmail() {
        return subscriberEmail;
    }

    public void setSubscriberEmail(String subscriberEmail) {
        this.subscriberEmail = subscriberEmail;
    }

    public Boolean getUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(Boolean unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    public Date getSubscribedDate() {
        return subscribedDate;
    }

    public void setSubscribedDate(Date subscribedDate) {
        this.subscribedDate = subscribedDate;
    }

    @Override
    public String toString() {
        return "Subscriber{" + "subscriberId=" + subscriberId + ", subscriberEmail=" + subscriberEmail + ", unsubscribe=" + unsubscribe + ", subscribedDate=" + subscribedDate + '}';
    }
    
    
}
