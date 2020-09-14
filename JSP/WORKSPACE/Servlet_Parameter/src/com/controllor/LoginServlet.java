package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "Login", urlPatterns = { "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8"); //2. post���� �Ѿ�� �� ���ڵ�
		
		//��û �۾� -> �Ķ���� ���(Ŭ���̾�Ʈ���� �� �����͸� request���� name�� �̿��Ͽ� �� �Ľ�)
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		System.out.println(userid+"\t"+passwd);
		
		//���� ó��
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("ID : "+userid+"<br>");
		out.print("PASSWORD : "+passwd+"<br>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		doGet(request, response);// 1. doGet���� �Ѱ���
	}

}
