package com.bridgelabz.bookstoreapp.model;

import com.bridgelabz.bookstoreapp.dto.OrderDto;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Data
@Entity
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long orderId;
    private int userId;
    private int bookId;
    private Date date;
    private int totalPrice;
    private int quantity;
    private String address;

    boolean cancel;

    public OrderData(OrderDto orderDto){
        this.userId= orderDto.userId;
        this.bookId= orderDto.bookId;
        this.date= orderDto.date;
        this.totalPrice= orderDto.totalPrice;
        this.quantity = orderDto.quantity;
        this.address = orderDto.address;

    }

    public OrderData() {

    }


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
