
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servletservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String resultMessage = performServerSideLogic(username, password);
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Server-side Servlet</h2>");
        out.println("<p>Server-side logic result: " + resultMessage + "</p>");
        out.println("</body></html>");
    }

    private String performServerSideLogic(String username, String password) {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            return "Validation successful for username: " + username;
        } else {
            return "Validation failed. Please provide valid username and password.";
        }
    }
}
