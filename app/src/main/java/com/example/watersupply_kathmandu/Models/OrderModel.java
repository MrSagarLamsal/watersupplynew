package com.example.watersupply_kathmandu.Models;

import java.util.Date;

public class OrderModel {
    private String name,contactno;
    private Date deliverydate;
    private Number quantity;
    private  String deliverylocation,otherdetails,user_email;


    public OrderModel(String name, String contactno, Date deliverydate, Number quantity, String deliverylocation, String otherdetails, String user_email) {
        this.name = name;
        this.contactno = contactno;
        this.deliverydate = deliverydate;
        this.quantity = quantity;
        this.deliverylocation = deliverylocation;
        this.otherdetails = otherdetails;
        this.user_email = user_email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public String getDeliverylocation() {
        return deliverylocation;
    }

    public void setDeliverylocation(String deliverylocation) {
        this.deliverylocation = deliverylocation;
    }

    public String getOtherdetails() {
        return otherdetails;
    }

    public void setOtherdetails(String otherdetails) {
        this.otherdetails = otherdetails;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

}
