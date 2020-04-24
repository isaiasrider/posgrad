package com.UmBookado.UmBookado.Controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String message = "Hello World!";
        PrintWriter writer = res.getWriter();
        writer.println(
                "<html>" +
                        "<body>" +
                        "<h1>" + message + "</h1>" +
                        "</body>" +
                        "</html"
        );
    }
}
