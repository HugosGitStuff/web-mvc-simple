package io.codeforall.bootcamp.canifetes;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // model: create a customer object with the data
        Customer customer = new Customer(1, "Hugo Ramalho", "hugo@email.com", "+351 968 567 589");

        // set the customer as request attribute so JSP can access it
        req.setAttribute("user", customer);

        // forward the request to the JSP(view) parser, letting him handle the request from now on
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/index.jsp");
        dispatcher.forward(req, resp);

    }

}
