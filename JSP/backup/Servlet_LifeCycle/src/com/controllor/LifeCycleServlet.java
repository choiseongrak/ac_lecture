package com.controllor;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	
//    �� �����̳ʿ� ���ؼ� ���� �ν��Ͻ��� ó�� ���� �� ��, �� �ѹ� ȣ��ȴ�. �ʱ�ȭ �۾��� �ַ� ���
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("--- init() ȣ�� ---");
	}

	/**
	 * @see Servlet#destroy()
	 */
//	���� �ν��Ͻ��� �� �����̳ʿ��� ���ŵ� �� ȣ��, ���� init �޼��忡�� �����ߴ� �ʱ�ȭ �۾��� �ݳ� ó���ϴ� �۾� �� �ַ� ���
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("--- destroy() ȣ�� ---");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--- doGet() ȣ�� ---");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
