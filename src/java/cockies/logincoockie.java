 
package cockies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class logincoockie extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name=request.getParameter("uname");
            String password=request.getParameter("pass");
          out.println("welcome:"+name);
                out.println("your password:"+password);
                Cookie obj = new Cookie("username",name);
                 Cookie obj1= new Cookie("pass",password);
                
                response.addCookie(obj);
                 response.addCookie(obj1);
                
                 out.print("<br><a href='welcome'>View Details</a>");
        }
    }

    
   
   
    
  
    

    
}
