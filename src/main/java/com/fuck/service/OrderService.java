package com.fuck.service;
import com.fuck.dao.OrderDao;
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao=orderDao;
    }

    public void generate(){
        orderDao.insert();
    }
}
