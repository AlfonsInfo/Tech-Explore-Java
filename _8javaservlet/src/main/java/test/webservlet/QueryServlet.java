package test.webservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.Stream;

@WebServlet(urlPatterns = "/query")
public class QueryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
        String[] numbers = req.getParameterValues("number");
        int sum = Stream.of(numbers).mapToInt(Integer::parseInt).sum();
        //Stream<String> test = Stream.of(numbers);
        resp.getWriter().println("Total number is " + sum);
        }catch (NullPointerException e)
        {
            resp.getWriter().println("Arraynya belum diisi bosqu");
//            System.out.println("Arraynya belum diisi bosqu");
        }
    }
}
