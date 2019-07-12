/**
 * 
 */
package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import net.sf.json.JSONObject;

/**
 * @author PE
 * @date 2019年7月11日 下午5:17:44
 * @explain 
 */
public class GetOneServlet extends HttpServlet { 
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setHp(353);
         
        JSONObject json= new JSONObject();
   
        json.put("hero", JSONObject.fromObject(hero));
        response.setContentType("text/html;charset=utf-8"); 
        response.getWriter().print(json);
    } 

}
