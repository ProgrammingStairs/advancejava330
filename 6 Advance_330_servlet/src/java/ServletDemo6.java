
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo6")
public class ServletDemo6 extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        ServletConfig config = getServletConfig();
        String  driverName = config.getInitParameter("driver");
        out.println("Driver name : "+driverName);
        
         ServletContext context = getServletContext();
        String  projectName = context.getInitParameter("project");
        out.println("<br>Project name : "+projectName);
    }
    
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
        processRequest(request, response);
    }
}
