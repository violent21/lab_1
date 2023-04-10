package com.example.demo1;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.util.Date;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Date date = new Date();
        request.setAttribute("date", date.toString());
        request.getRequestDispatcher("time.jsp").forward(request, response);
    }

    public void destroy() {
    }
}