
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = {"/demo1","/demo2"})
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("This is an example of <h2>Servlet created by HttpServlet class | method : "+request.getMethod()+"</h2>");
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
