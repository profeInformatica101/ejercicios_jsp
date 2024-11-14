package com.miproyecto.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Saludo")
public class SaludoServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;


	/**
     * @see HttpServlet#HttpServlet()
     */
    public SaludoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String nombre = request.getParameter("name");

        // Imprime en consola (opcional)
        System.out.println("doGet :: Hola " + nombre);

        
        /**
         * ## Envio Datos al *.JSP ##
         */
        // Establece el atributo para enviarlo al JSP
        request.setAttribute("nombre", nombre);

        // Reenvía la solicitud a la página JSP
        request.getRequestDispatcher("/saludo.jsp").forward(request, response);
	}

}
