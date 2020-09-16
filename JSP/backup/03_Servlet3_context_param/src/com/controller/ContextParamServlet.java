package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ContextParamServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ContextParamServlet.doGet");

		//context파라미터 얻기
		ServletContext ctx = getServletContext(); //ServletContext 객체 얻은 후 파싱
		
		String userid = ctx.getInitParameter("userid");
		String email = ctx.getInitParameter("email");
		
		System.out.println(userid+"\t"+email);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
