package com.example.demo;

import com.example.demo.MainTask.Validation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MainServlet", value = "/main-servlet")
public class MainServlet extends HttpServlet {

    private Validation validation;
    private PrintWriter writer;

    public void init(){
        validation = new Validation();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        validation.setLogin(request.getParameter("login"));
        validation.setPassword(request.getParameter("password"));
        writer = response.getWriter();
        if(validation.isValid()){
            request.getRequestDispatcher("successValidation.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
}
