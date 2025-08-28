package controller;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                
            String email = request.getParameter("email");
            String password = request.getParameter("password");
                
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            if(email.equals("admin@gmail.com") && password.equals("admin@123")){
                Cookie cookie = new Cookie("email", email);
                //cookie.setMaxAge(15);
                response.addCookie(cookie);
                out.print("Cookie added successfully");    
                rd.include(request, response);
            }else{
                out.print("Error while adding Cookie");    
                rd.include(request, response);
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
