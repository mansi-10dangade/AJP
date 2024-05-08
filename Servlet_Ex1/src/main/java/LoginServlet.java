import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isValid = validateLogin(username, password);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        if (isValid) {
            out.println("<h2>Login Successful</h2>");
        } else {
           out.println("<h2>Invalid Username or Password</h2>");
        }
        out.println("</body></html>");
    }
 private boolean validateLogin(String username, String password) {
           return "Mansi Dangade ".equals(username) &&"sss207(J;7277".equals(password);
    }
}
