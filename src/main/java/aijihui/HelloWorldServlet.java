package aijihui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by maozhijian on 18/5/16.
 */
@WebServlet(name = "HelloWorld",urlPatterns = {"/hello"},initParams = {@WebInitParam(name = "name",value = "maomao")})

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException , IOException {
        System.out.println(req.getHeaders("x").toString());
        resp.getWriter().print("Hello "+getInitParameter("name"));
    }

}
