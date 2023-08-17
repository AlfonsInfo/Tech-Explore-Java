package test.webservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/not-found")
public class NotFoundServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String json= """
                {
                    "name" : "Alfons",
                    "value" : 20
                }
                """;
        resp.setStatus(404);
        //resp.setHeader("Content-Type", "application/json");
        resp.getWriter().println("Not Found");
    }
}
