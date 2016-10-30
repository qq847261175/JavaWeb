package qq.zh;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {
        resp.setContentType("text/html;charset=gb2312");
        
        HttpSession session=req.getSession();
        session.invalidate();
        
        PrintWriter out=resp.getWriter();
        out.println("<html><head><title>�˳���¼</title></head>");
        out.println("<body>");
        out.println("���˳���¼<br>");
        out.println("<a href="+resp.encodeURL("login")+">���µ�¼</a>");
        out.println("</body></html>");
        out.close();
    }  
}