package com.roger.chapter1.controller;

import com.roger.chapter1.model.Customer;
import com.roger.chapter1.service.CustomerService;
import com.roger.chapter1.util.CastUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {
    private CustomerService customerService;


    @Override
    public void init() throws ServletException {
        customerService=new CustomerService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id=CastUtil.castLong(req.getParameter("id"));
        if(customerService.deleteCustomer(id)){
            List<Customer> customerList=customerService.getCustomerList();
            req.setAttribute("customerList",customerList);
            req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
        }
        else{
            req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);

        }

    }
}
