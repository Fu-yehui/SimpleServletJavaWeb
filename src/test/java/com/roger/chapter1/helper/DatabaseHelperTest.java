package com.roger.chapter1.helper;

import com.roger.chapter1.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DatabaseHelperTest {

    @Test
    void queryEntityList() {
        List<Customer> list=DatabaseHelper.queryEntityList(Customer.class);
        System.out.println(list);
        Assertions.assertEquals(list.size(),2);
    }

    @Test
    void queryEntity() {
        Customer customer=DatabaseHelper.queryEntity(Customer.class,1);
        System.out.println(customer);
        Assertions.assertNotNull(customer);

    }

    @Test
    void insertEntity() {
        long id=2;
        Map<String,Object> fieldMap=new HashMap<String, Object>();
        fieldMap.put("contact","Eric");
        boolean result = DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
        Assertions.assertTrue(result);

    }

    @Test
    void updateEntity() {

        long id=1;
        Map<String,Object> fieldMap=new HashMap<String, Object>();
        fieldMap.put("contact","Eric");
        boolean result = DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
        Assertions.assertTrue(result);
    }

    @Test
    void deleteEntity() {
        long id=1;
        boolean result = DatabaseHelper.deleteEntity(Customer.class,id);
        Assertions.assertTrue(result);
    }
}