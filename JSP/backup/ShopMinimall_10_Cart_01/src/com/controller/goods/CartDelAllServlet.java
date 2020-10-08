package com.controller.goods;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;

/**
 * Servlet implementation class CartDelAllServlet
 */
@WebServlet("/CartDelAllServlet")
public class CartDelAllServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if(dto!=null) {
			String data = request.getParameter("data");
			System.out.println(data);
			
			String [] x = data.split(",");//쉼표로 구분
			List<String> list = Arrays.asList(x); //배열을 리스트로 변환
			
			CartService service = new CartService();
			int n = service.cartAllDel(list);
				if(n>0) {
					nextPage ="CartListServlet";
				}
		} else {
			session.setAttribute("str", "로그인이 필요한 작업입니다.");
			nextPage = "loginForm.jsp";
		}
		response.sendRedirect(nextPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
