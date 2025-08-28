package controller;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
            
           Cookie ck[] = request.getCookies();
            if(ck!=null){
                    for(Cookie cookie : ck){
                        if(cookie.getName().equals("email")){
                                cookie.setMaxAge(0);
                                response.addCookie(cookie);
                                out.print("<script>alert('Logout Successfully')</script>");
                                rd.include(request, response);
                        }
                    }
            }else{
                out.print("<script>alert('No cookie set')</script>");
                rd.forward(request, response);
            }

            
        }catch(Exception e){
            System.out.println("Exception :  "+e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
