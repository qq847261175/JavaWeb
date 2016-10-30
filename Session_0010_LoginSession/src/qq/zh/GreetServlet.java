package qq.zh;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

import qq.zh.*;

public class GreetServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {
        HttpSession session=req.getSession();
        String user=(String)session.getAttribute("user");
        
        if(null==user)
        {
            resp.sendRedirect(resp.encodeRedirectURL("login"));
        }
        else
        {
            resp.setContentType("text/html;charset=gb2312");
            PrintWriter out=resp.getWriter();
            out.println("<html><head><title>��ӭҳ��</title></head>");
            out.println("<body>");
            
            OutputSessionInfo.printSessionInfo(out,session);
            
            out.println("<p>");
            out.println("��ӭ�㣬"+user+"<p>");
            out.println("<a href="+resp.encodeURL("login")+">���µ�¼</a>");
            out.println("<a href="+resp.encodeURL("logout")+">ע��</a>");
            out.println("</body></html>");
            out.close();
        }
    }
}