package test.webservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
        Path path = Path.of(FormServlet.class.getResource("/html/form.html").getPath());
        String html = Files.readString(path);
        System.out.println("HTML : " + html);
        resp.getWriter().println(html);
        } catch (Exception e) {
            resp.getWriter().println("Error: " + e.getMessage());
        }
    }


    //Apa beda Form Data, FORM URL ENCODED
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String name = req.getParameter("firstName") + " " + req.getParameter("lastName");
            String hello = "Hello " + name;
            resp.getWriter().println(hello);
        }catch (Exception e)
        {
            resp.getWriter().println(e);
        }
    }
}
