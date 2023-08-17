package test.webservlet.Filter;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


@WebFilter(urlPatterns = "/*")
public class LoginFilter extends HttpFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogFilter.class);

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        LOGGER.info("Login Filter " + request.getRequestURI());
        if(request.getRequestURI().equals("/session/login"))
        {
            chain.doFilter(request,response);
        }else{
            HttpSession session = request.getSession(true);
            String username = (String) session.getAttribute("username");
            if(username == null){
                response.setStatus(401);
                response.getWriter().println("You need to login first");
//                response.sendRedirect("/session/login");
            }else{
                chain.doFilter(request,response);
            }
        }
    }
}
