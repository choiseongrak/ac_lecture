package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//0. ����� ��û ������ �̱�
		//1. ����� ��û ������ ó��
		//2. ��û �Ϸ� �� ���� ó��
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8"); //2-1. HTML Content Type ����
		PrintWriter out = response.getWriter(); //2-2. �ڹٿ��� ������ ������ ���
		out.print("<html><body>");//2-3. ������ html �ڵ� �ۼ�
		out.print("<h1>���� ����ó�� �ǽ�<h1>");
		out.print("<p>Hello World<p>");
		out.print("</html></body>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
