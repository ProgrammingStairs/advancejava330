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

public class DeleteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
               
            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("email");
            
                UserDAO userDao = new UserDAO();
                String deleteEmail = request.getParameter("deleteEmail");
                int i = userDao.deleteEmail(deleteEmail);
                if(i>0)
                    out.print("<script>alert('User deleted successfully')</script>");
                else
                    out.print("<script>alert('Error while deleting user')</script>");
                
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
