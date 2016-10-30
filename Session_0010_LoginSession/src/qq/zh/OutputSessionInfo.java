package qq.zh;


import java.io.*;
import javax.servlet.http.*;
import java.util.Date;

public class OutputSessionInfo
{
    public static void printSessionInfo(PrintWriter out,HttpSession session)
    {
        out.println("<table>");
        
        out.println("<tr>");
        out.println("<td>�Ự��״̬��</td>");
        if(session.isNew())
        {
            out.println("<td>�µĻỰ</td>");
        }
        else
        {
            out.println("<td>�ɵĻỰ</td>");
        }
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>�ỰID��</td>");
        out.println("<td>"+session.getId()+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>����ʱ�䣺</td>");
        out.println("<td>"+new Date(session.getCreationTime())+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>�ϴη���ʱ�䣺</td>");
        out.println("<td>"+new Date(session.getLastAccessedTime())+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>��󲻻ʱ����(s)��</td>");
        out.println("<td>"+session.getMaxInactiveInterval()+"</td>");
        out.println("</tr>");
        
        out.println("</table>");
    }
}