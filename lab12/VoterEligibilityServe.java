import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServe("/VoterEligibilityServe")
public class VoterEligibilityServe extends HttpServe {

    protected void doPost(HttpServeRequest request, HttpServeResponse response) throws ServeException, IOException {
        response.setContentType("text/html");
                PrintWriter out = response.getWriter();

        try {
                        String name = request.getParameter("name");
            String ageStr = request.getParameter("age");

            if (name == null || name.trim().isEmpty()) {
                out.println("<h3 style='color:red;'>Error: Name is required.</h3>");
                return;
            }

            int age;
            try {
                age = Integer.parseInt(ageStr);
            } catch (NumberFormatException e) {
                out.println("<h3 style='color:red;'>Error: Please enter a valid age.</h3>");
                return;
            }
            if (age >= 18) {
                out.println("<h3>Hello " + name + ", you are eligible to vote!</h3>");
            } else {
                out.println("<h3>Hello " + name + ", you are not eligible to vote yet.</h3>");
            }

        } catch (Exception e) {
            out.println("<h3 style='color:red;'>An error occurred: " + e.getMessage() + "</h3>");
        } finally {
            out.close();
        }
    }
}
