package com.bridgelabz.bookstoreapp.dto;

import com.bridgelabz.bookstoreapp.model.User;

import java.sql.Date;

public class OrderDto {

    public int userId;

    public int bookId;
    public Date date;

    public int totalPrice;

    public int quantity;

    public String address;

    boolean cancel;

    public OrderDto(int userId, int bookId,  Date date, int totalPrice, int quantity, String address) {
        this.userId = userId;
        this.bookId = bookId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.address = address;
    }
}
