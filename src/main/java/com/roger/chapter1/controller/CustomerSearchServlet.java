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

@WebServlet("/customer_search")
public class CustomerSearchServlet extends HttpServlet {
    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService=new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer=customerService.getCustomer(CastUtil.castLong(req.getParameter("search_id")));
        req.setAttribute("customer",customer);
        req.getRequestDispatcher("/WEB-INF/view/customer_search.jsp").forward(req, resp);
    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Customer customer=customerService.getCustomer(CastUtil.castLong(req.getParameter("search_id")));
//        req.setAttribute("customer",customer);
//        req.getRequestDispatcher("/WEB-INF/view/customer_search.jsp").forward(req, resp);
//    }

}