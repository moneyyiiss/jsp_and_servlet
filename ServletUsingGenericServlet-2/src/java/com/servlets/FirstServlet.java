/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Manis
 */
public class FirstServlet implements Servlet {

    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
       this.config = config;
        System.out.println("creating object");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("this is servicing: ");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h1>this is servicing method: </h1>");
        out.print("<h1>this is date: " + new Date().toString() + "</h1>");
    }

    @Override
    public String getServletInfo() {
        return "this servlet is created by admin";
    }

    @Override
    public void destroy() {
        System.out.println("Going to destroy servlet object");
    }
    
}
