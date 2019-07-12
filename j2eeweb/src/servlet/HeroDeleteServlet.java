/**
 * 
 */
package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HeroDAO;

/**
 * @author PE
 * @date 2019年7月11日 下午4:25:30
 * @explain 
 */
public class HeroDeleteServlet extends HttpServlet {
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        int id = Integer.parseInt(request.getParameter("id"));
         
        new HeroDAO().delete(id);
 
        response.sendRedirect("/j2eeweb/listHero");
         
    }
}
