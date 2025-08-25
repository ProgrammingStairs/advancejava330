package controller;
import dao.UserDAO;
import dto.UserDTO;
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
                
            UserDAO userDao = new UserDAO();
            int i = userDao.loginUser(email,password);
            if(i>0){
//                out.print("Login Successfull");
                HttpSession session = request.getSession();
                  session.setAttribute("email", email);
                  
                RequestDispatcher rd = request.getRequestDispatcher("ProfileServlet");
                rd.forward(request, response);
            }else{
//                out.print("Error while doing Login");
                   RequestDispatcher rd = request.getRequestDispatcher("login.html");
                out.print("<script>alert('Error while Login')</script>");
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
