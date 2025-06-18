package org.fuck.damn.service;

import org.fuck.damn.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {

   /* @Autowired
    @Qualifier("orderDaoImpByMySQL")*/
    private OrderDao orderDao;

//    @Autowired
 /*   public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }*/


    public OrderService( @Autowired OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.insert();
    }
}
