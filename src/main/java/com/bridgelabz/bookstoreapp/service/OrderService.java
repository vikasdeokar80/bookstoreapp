package com.bridgelabz.bookstoreapp.service;

import com.bridgelabz.bookstoreapp.dto.OrderDto;
import com.bridgelabz.bookstoreapp.model.OrderData;
import com.bridgelabz.bookstoreapp.repository.OrderRepo;
import com.bridgelabz.bookstoreapp.util.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IOrderService{

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    EmailSenderService emailSender;

    public OrderData insert(OrderDto orderDto){
        OrderData orderData = new OrderData(orderDto);
        return orderRepo.save(orderData);
    }

    public List<OrderData> getAll(){
        return orderRepo.findAll();
    }

    public Optional<OrderData> getById(Long id){
        return orderRepo.findById(id);
    }

    public void delete(Long id){
        orderRepo.deleteById(id);
    }

    public OrderData updateById(Long id, OrderDto orderDto){
        OrderData orderData = new OrderData(orderDto);
        orderData.setOrderId(id);
        OrderData orderData1= orderRepo.save(orderData);
        return  orderData1;

    }

    public Object cancelOrder(Long orderId){
        Optional<OrderData> orderData = orderRepo.findById(orderId);
        if (orderData.isPresent()){
            OrderData orderData1 = orderData.get();
            orderRepo.delete(orderData1);
            return "Order canceled";
        }
        else return "Order id not found";
    }

}
