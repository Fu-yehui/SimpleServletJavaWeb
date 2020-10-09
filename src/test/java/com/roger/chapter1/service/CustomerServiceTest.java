package com.roger.chapter1.service;

import com.roger.chapter1.helper.DatabaseHelper;
import com.roger.chapter1.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest(){
        this.customerService=new CustomerService();
    }

    /**
     * 为每个测试都进行初始化数据库
     */
    @BeforeEach
    void setUp() {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    void getCustomerList() {
        List<Customer> list=customerService.getCustomerList();
        Assertions.assertEquals(2,list.size());
    }

    @Test
    void getCustomer() {
        long id=1;
        Customer customer=customerService.getCustomer(id);
        Assertions.assertNotNull(customer);
    }

    @Test
    void createCustomer() {
        Map<String,Object> fieldMap=new HashMap<String,Object>();
        fieldMap.put("name","customer100");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","1041262515");
        boolean result=customerService.createCustomer(fieldMap);
        Assertions.assertTrue(result);
    }

    @Test
    void updateCustomer() {
        long id=1;
        Map<String,Object> fieldMap=new HashMap<String, Object>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assertions.assertTrue(result);
    }

    @Test
    void deleteCustomer() {
        long id=1;
        boolean result = customerService.deleteCustomer(id);
        Assertions.assertTrue(result);
    }
}