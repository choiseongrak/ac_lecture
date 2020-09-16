package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

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
		
		request.setCharacterEncoding("utf-8");
		
		//Map���·� �Ķ���� ���
		Map<String, String[]> map = request.getParameterMap(); //key, value�� Map���� ����
		
		//����ó��
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		Set<String> keys = map.keySet(); //keySet()�̿� key ��ü�� Set���� ����
		for(String key: keys) {
			String [] values = map.get(key); //map���� key�� �̿��Ͽ� value�� ������ �迭�� ����
			String mesg = "";  //��¿� ����
			for(String v: values) { //map.get(key) -> �迭�� ��� for���� �ѹ� �� ������ ���� ������ ����
				mesg += v; //values�� ��¿� ������ ����
			}
			out.print(key +" : "+mesg+"<br>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
