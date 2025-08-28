package controller;

import dao.UserDAO;
import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateFormServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
               
            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("email");
            
       out.print("<!DOCTYPE html><html><head><title>TODO supply a title</title><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'><link href='./public/style.css'><script>(()=>{window.history.forward();})()</script><style>body{font-family: candara;padding:30px;}#nav{height: 50px;background-color: black;}#nav ul{padding-top: 10px;list-style: none;}#nav ul li {display: inline;}#nav ul li a{font-size: 20px;color:white;margin-left: 40px;text-decoration: none;}p{font-size: 20px;text-align: justify;}input[type='email'],input[type='password'],input[type='text']{height:30px;width:300px;margin:5px;font-size: 17px;}input[type='submit'],input[type='reset']{height:35px;width:305px;margin:5px;font-size: 17px;background-color: black;color:white;border-width: 0px;} </style></head><body><h1>Servlet CRUD operation</h1><div id='nav'><ul><li><a href=''>Welcome "+email+"</a></li><li><a href=''>Home</a></li><li><a href='ViewUsersServlet'>View All Users</a></li><li><a href='LogoutServlet'>Logout</a></li></ul></div><h1>Update User</h1>");

                UserDAO userDao = new UserDAO();
                String updateEmail = request.getParameter("updateEmail");
                UserDTO user  = userDao.getUser(updateEmail);
                
                out.print("<form action='Updation' method='post'>");
out.print("<input type='text' placeholder='Enter Username' value='"+user.getUsername()+"' id='username' name='username'><br>");
out.print("<input type='email' readonly  placeholder='Enter Email' value='"+user.getEmail()+"' id='email' name='email'><br>");
out.print("<input type='text' placeholder='Enter Password' value='"+user.getPassword()+"' id='password' name='password'><br>");
out.print("<input type='text' placeholder='Enter Address' value='"+user.getAddress()+"' id='address' name='address'><br>");
out.print("<input type='submit' value='Update'><br>");
out.print("<input type='reset' value='Reset'><br>");
out.print("</form>");
        
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
