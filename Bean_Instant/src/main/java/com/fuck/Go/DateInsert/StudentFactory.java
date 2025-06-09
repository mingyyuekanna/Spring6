package com.fuck.Go.DateInsert;

import org.springframework.beans.factory.FactoryBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentFactory implements FactoryBean<Date> {

    private String brithDay;

    public StudentFactory() {
    }

    public StudentFactory(String brithDay) {
        this.brithDay = brithDay;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(brithDay);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
