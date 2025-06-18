package org.fuck.damn.dao.imp;

import org.fuck.damn.dao.OrderDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository("orderDaoImpByOracle")
public class OrderDaoImpByOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("使用Oracle进行数据插入");
    }
}
