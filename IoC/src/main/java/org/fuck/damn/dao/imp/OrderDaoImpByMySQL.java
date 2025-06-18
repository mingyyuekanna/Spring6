package org.fuck.damn.dao.imp;

import org.fuck.damn.dao.OrderDao;
import org.springframework.stereotype.Component;

@Component("orderDaoImpByMySQL")
public class OrderDaoImpByMySQL implements OrderDao {
    @Override
    public void insert() {
        System.out.println("使用MySQL进行插入..");
    }
}
