package test.webservlet.singleton;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/unsafe")
public class UnsafeServlet extends HttpServlet {
    private String response = "";

    //Race Condition
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Long sleep = Long.parseLong(req.getParameter("sleep"));
        response = "Hello " + name; //get parameter dengan key response

        try{
            Thread.sleep(sleep);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        resp.getWriter().println(response);
    }
}
