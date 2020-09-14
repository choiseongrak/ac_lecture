package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReserveTicketServlet
 */
@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String birth = request.getParameter("birthday");
		String type [] = request.getParameterValues("type");
		
		LocalDate currDate = LocalDate.now();
		
		int age = currDate.getYear() - Integer.parseInt(birth.substring(0,4))+1;
		
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String mesg1="";
		String mesg2="";
		double price;
		
		
		
		mesg1 += "�Է��� ������� : "+birth;
		for(String t:type) {
			mesg1 += " ������ Ƽ�� : "+t;
		}
		out.print("<b>"+mesg1+"</b>");
		
		mesg2 += "<br>���� : " + age;
		
		for(String t:type) {
			if(age<=9) {
				price = Math.round(Integer.parseInt(t)*0.6);
				mesg2 += " ��� : �̼�����, ���� ���� �ݾ� : "+price;
				
				
			} else if (age>=19 && age<=60) {
				price = Math.round(Integer.parseInt(t)*0.9);
				mesg2 += " ��� : ����, ���� ���� �ݾ� : "+price;
			} else {
				price = Math.round(Integer.parseInt(t)*0.5);
				mesg2 += " ��� : ��ο����, ���� ���� �ݾ� : "+price;
			}
		}
		out.print(mesg2);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
