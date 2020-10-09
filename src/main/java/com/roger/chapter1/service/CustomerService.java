package com.roger.chapter1.service;

import com.roger.chapter1.helper.DatabaseHelper;
import com.roger.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 具体的逻辑代码
 */
public class CustomerService {


    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(){
        return DatabaseHelper.queryEntityList(Customer.class);
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){

        return DatabaseHelper.queryEntity(Customer.class,id);
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){

        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新客户
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     * 删除客户
      * @param id
     * @return
     */
    public boolean deleteCustomer(long id){

        return DatabaseHelper.deleteEntity(Customer.class,id);
    }


}
