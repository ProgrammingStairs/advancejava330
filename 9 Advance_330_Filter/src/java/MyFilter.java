
import java.io.*;
import javax.servlet.*;

public class MyFilter implements Filter {

    public MyFilter() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        try (PrintWriter out = response.getWriter();) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            if (email.equals("admin@gmail.com") && password.equals("admin@123")) {
                chain.doFilter(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                out.print("<script>alert('Email id or password is wrong')</script>");
                rd.include(request, response);
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }
}
