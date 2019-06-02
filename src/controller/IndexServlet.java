package controller;

import modelos.Pais;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndexServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO acceso a la bd
        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("1", "Peru"));
        paises.add(new Pais("2", "Argentina"));
        paises.add(new Pais("3", "Colombia"));
        paises.add(new Pais("4", "Siria"));
        paises.add(new Pais("5", "Corea del Norte"));

        request.setAttribute("paises", paises);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
