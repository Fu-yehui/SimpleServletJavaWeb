package com.roger.chapter1.controller;

import com.roger.chapter1.model.Customer;
import com.roger.chapter1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建客户
 */
@WebServlet("/customer_create")
public class CostomerCreateServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService=new CustomerService();
    }
    /**
     * 进入 创建客户 界面
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Map<String,Object> params = new HashMap<>(4);
//        params.put("name",req.getParameter("name"));
//        params.put("contact",req.getParameter("contact"));
//        params.put("telephone",req.getParameter("telephone"));
//        params.put("email",req.getParameter("email"));
//        if (customerService.createCustomer(params)){
//            List<Customer> customerList=customerService.getCustomerList();
//            req.setAttribute("customerList",customerList);
//            req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
//        }
//        else{
//            req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);
//
//        }

        req.getRequestDispatcher("/WEB-INF/view/customer_create.jsp").forward(req, resp);

    }


    /**
     * 处理 创建客户 请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,Object> params = new HashMap<>(4);
        params.put("name",req.getParameter("name"));
        params.put("contact",req.getParameter("contact"));
        params.put("telephone",req.getParameter("telephone"));
        params.put("email",req.getParameter("email"));
        if (customerService.createCustomer(params)){
            List<Customer> customerList=customerService.getCustomerList();
            req.setAttribute("customerList",customerList);
            req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
        }
        else{
            req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);

        }

    }
}
