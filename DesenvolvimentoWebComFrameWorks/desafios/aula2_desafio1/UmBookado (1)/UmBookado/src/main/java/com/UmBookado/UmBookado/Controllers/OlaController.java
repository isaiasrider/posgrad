package com.UmBookado.UmBookado.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/oi")
public class OlaController extends HttpServlet {
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter responde = response.getWriter();

        // escreve o texto
        responde.println("<html>");
        responde.println("<head>");
        responde.println("<title>Primeira Servlet</title>");
        responde.println("</head>");
        responde.println("<body>");
        responde.println("<h1>Oi mundo Servlet!</h1>");
        responde.println("</body>");
        responde.println("</html>");
    }

    }


