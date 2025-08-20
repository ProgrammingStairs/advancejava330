
import java.io.*;
import javax.servlet.*;

public class ServletDemo2 extends GenericServlet{
    
    @Override
    public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out =  response.getWriter();
        out.print("This is an example of <h1>Servlet by extending GenericServlet</h1>");
    }    
    
}
