/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-22 09:12:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dto.PageDTO;
import java.util.List;
import com.dto.EmpDTO;
import java.util.ArrayList;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.dto.EmpDTO");
    _jspx_imports_classes.add("com.dto.PageDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>사원관리</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<b>[ 사원 목록 ]</b>\r\n");
      out.write("\t<hr></hr>\r\n");
      out.write("\t");

	PageDTO pDTO = (PageDTO) request.getAttribute("pDTO");
	List<EmpDTO> list = pDTO.getList();
	String order = (String)request.getAttribute("order");
	String searchName = (String)request.getAttribute("searchName");
	String searchValue = (String)request.getAttribute("searchValue");
	
      out.write("\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 검색기능 -->\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t<form action=\"EmpListServlet\">\r\n");
      out.write("\t\t\t\t\t<select name=\"searchName\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"hiredate\">입사일(년도만)</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"ename\">이름</option>\r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"searchValue\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<!-- 검색기능  -->\r\n");
      out.write("\t\t<!-- 정렬기준 -->\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>정렬기준</th>\r\n");
      out.write("\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t  <form action=\"EmpOrderServlet\">\r\n");
      out.write("\t\t\t      월급 높은 순 : <input type=\"radio\" name=\"order\" value=\"desc\" ");
 if("desc".equals(order) || order == null) { 
      out.write(" checked=\"checked\" ");
 } 
      out.write("/>\r\n");
      out.write("\t\t\t\t 월급낮은 순 : <input type=\"radio\" name=\"order\" value=\"asc\" ");
 if("asc".equals(order)){ 
      out.write(" checked=\"checked\"");
 } 
      out.write("/>\r\n");
      out.write("\t\t\t\t  <input type=\"submit\" value=\"정렬\">\r\n");
      out.write("               </form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 정렬기준 -->\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>사원번호</th>\r\n");
      out.write("\t\t\t<th>사원이름</th>\r\n");
      out.write("\t\t\t<th>직업</th>\r\n");
      out.write("\t\t\t<th>입사일</th>\r\n");
      out.write("\t\t\t<th>월급</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			for (int i = 0; i < list.size(); i++) {
				EmpDTO dto = list.get(i);
				int empno = dto.getEmpno();
				String ename = dto.getEname();
				String job = dto.getJob();
				String hiredate = dto.getHiredate();
				int sal = dto.getSal();
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"EmpRetrieveServlet?empno=");
      out.print(empno);
      out.write('"');
      out.write('>');
      out.print(empno);
      out.write("</a></td>\r\n");
      out.write("\t\t\t<td>");
      out.print(ename);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(job);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(hiredate);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(sal);
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

			} //end for
			
			int curPage = pDTO.getCurPage();
			int perPage = pDTO.getPerPage();
			int totalCount = pDTO.getTotalCount();
			int totalPage = totalCount/perPage;
			if(totalCount%perPage != 0) totalPage++;
		
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t");

			for(int i=1;i<=totalPage;i++){
				if(i == curPage){
					out.print(i+"&nbsp;");
				} else {
					out.print("<a href='EmpListServlet?curPage="+i+"&searchName="+searchName+"&searchValue="+searchValue+"'>"+i+"</a>&nbsp;");
				}
			}
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<!-- MVC패턴을 위해 Servlet으로 감 -->\r\n");
      out.write("\t<!-- <a href=\"EmpWriteFormServlet\">사원등록</a> -->\r\n");
      out.write("\t<button class=\"addBtn\">사원등록</button>\r\n");
      out.write("\t<script src=\"list.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}