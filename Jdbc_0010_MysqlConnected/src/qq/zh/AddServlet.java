package qq.zh;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
   
	private String url;
	private String password;
	private String username;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		url=getServletContext().getInitParameter("url");
		username=getServletContext().getInitParameter("username");
		password="";
		try {
			Class.forName("com.mysql.jdbc.driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			statement.execute("insert into t_students (username,password) values('qq847261175','zh847261175')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
