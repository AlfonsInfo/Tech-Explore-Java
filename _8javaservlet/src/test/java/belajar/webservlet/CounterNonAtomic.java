package belajar.webservlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@WebServlet(urlPatterns = "/counternonatomic")
public class CounterNonAtomic extends HttpServlet {

    private Integer atomicLong = 0;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long total = atomicLong++;
        String response = "Total Counter : " + total;
        resp.getWriter().println(response);
    }
}
