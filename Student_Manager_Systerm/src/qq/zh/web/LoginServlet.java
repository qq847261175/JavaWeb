package qq.zh.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qq.zh.domain.Student;
import qq.zh.service.UserService;

public class LoginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.err.println("123");
		String username = null;
		String password = null;
		username=request.getParameter("username");
		System.out.println("username:"+username);
		password=request.getParameter("password");
		//--����username��password
		UserService service=new UserService();
		Student student=service.findUserNameAndPsw(username,password);
		//--��userservice���service
		if (student==null) {
			System.out.println(1);
			request.setAttribute("msg", "�˺��������");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		}
		else{
			request.getSession(true).setAttribute("Student", student);
			request.getRequestDispatcher("Web/welcome.jsp").forward(request, response);
			
		}
		//--�ͷ��ؽ������Ӧ�û�дmsg����������¼�ɹ�JSPҳ�滹�ǻ�дJSP
	}

}