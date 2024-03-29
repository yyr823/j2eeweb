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
 * @date 2019年7月11日 下午5:09:15
 * @explain 
 */
public class SubmitServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String data =request.getParameter("data");
         
        System.out.println("服务端接收到的数据是：" +data);
  
        JSONObject json=JSONObject.fromObject(data); 
          
        System.out.println("转换为JSON对象之后是："+ json);
           
        Hero hero = (Hero)JSONObject.toBean(json,Hero.class); 
        System.out.println("转换为Hero对象之后是："+hero);
   System.out.println(hero.getName()+":"+hero.getHp());
    
    } 
}
