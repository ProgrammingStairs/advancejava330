package controller;
import dao.UserDAO;
import dto.UserDTO;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("email");
            
       out.print("<!DOCTYPE html><html><head><title>TODO supply a title</title><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'><link href='./public/style.css'><script>(()=>{window.history.forward();})()</script><style>body{font-family: candara;padding:30px;}#nav{height: 50px;background-color: black;}#nav ul{padding-top: 10px;list-style: none;}#nav ul li {display: inline;}#nav ul li a{font-size: 20px;color:white;margin-left: 40px;text-decoration: none;}p{font-size: 20px;text-align: justify;} </style></head><body><h1>Servlet CRUD operation</h1><div id='nav'><ul><li><a href=''>Welcome "+email+"</a></li><li><a href=''>Home</a></li><li><a href='ViewUsersServlet'>View All Users</a></li><li><a href='LogoutServlet'>Logout</a></li></ul></div><h1>Profile Page</h1>");

out.print("gets entry");	
out.print("</body></html>");


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
