package com.David.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.David.models.Cat;
import com.David.models.Dog;


@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Dogs() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		int weight = Integer.parseInt(request.getParameter("weight"));
		
		Dog dog = new Dog(name, breed, weight);
		request.setAttribute("dog", dog);

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/cat.jsp");
        view.forward(request, response);
	}

}
