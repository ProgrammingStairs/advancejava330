package controller;

import dao.UserDAO;
import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Updation extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
               
            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("email");
            
           UserDAO userDao = new UserDAO();
            String username = request.getParameter("username");
            String updateEmail = request.getParameter("email");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
                
            UserDTO userDto = new UserDTO();
            userDto.setUsername(username);
            userDto.setEmail(updateEmail);
            userDto.setPassword(password);
            userDto.setAddress(address);
            
             int i = userDao.updateUser(userDto);
            if(i>0)
                    out.print("<script>alert('User Updated successfully')</script>");
                else
                    out.print("<script>alert('Error while updating user')</script>");
                
                    RequestDispatcher rd = request.getRequestDispatcher("ViewUsersServlet");
                    rd.include(request, response);

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
