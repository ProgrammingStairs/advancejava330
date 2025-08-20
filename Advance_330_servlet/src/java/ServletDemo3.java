
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo3 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("This is an example of <h2>Servlet created by HttpServlet class</h2>");
    }
}
