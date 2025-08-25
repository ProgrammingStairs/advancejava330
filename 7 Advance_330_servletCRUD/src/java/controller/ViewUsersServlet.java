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

public class ViewUsersServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
               
            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("email");
            
       out.print("<!DOCTYPE html><html><head><title>TODO supply a title</title><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'><link href='./public/style.css'><script>(()=>{window.history.forward();})()</script><style>body{font-family: candara;padding:30px;}#nav{height: 50px;background-color: black;}#nav ul{padding-top: 10px;list-style: none;}#nav ul li {display: inline;}#nav ul li a{font-size: 20px;color:white;margin-left: 40px;text-decoration: none;}p{font-size: 20px;text-align: justify;} </style></head><body><h1>Servlet CRUD operation</h1><div id='nav'><ul><li><a href=''>Welcome "+email+"</a></li><li><a href=''>Home</a></li><li><a href='ViewUsersServlet'>View All Users</a></li><li><a href='LogoutServlet'>Logout</a></li></ul></div><center><h1>Users List</h1></center>");
                UserDAO userDao = new UserDAO();
                List<UserDTO> usersList = userDao.getAllUsersList(); 
                out.print("<table align='center' cellspacing='0' cellpadding='10' border='1'><tr><th>S.No</th><th>Username</th><th>Email</th><th>Password</th><th>Address</th><th colspan='2'>Action</th></tr>");
                for(int i=0;i<usersList.size();i++){
                  out.println("---> "+i+"-------> "+usersList.get(i).getUsername());

                    out.print("<tr><td>"+(i+1)+"</td><td>"+usersList.get(i).getUsername()+"</td><td>"+usersList.get(i).getEmail()+"</td><td>"+usersList.get(i).getPassword()+"</td><td>"+usersList.get(i).getAddress()+"</td><td>Update</td><td><form action='DeleteServlet'><input type='hidden' name='deleteEmail'  value='<%=usersList.get(i).getEmail()%>'><button>Delete</button></form></td></tr>");
                }
                out.print("</table>");
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
