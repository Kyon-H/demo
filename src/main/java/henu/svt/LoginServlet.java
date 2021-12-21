package henu.svt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/check")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取参数
		String name=request.getParameter("user");
		//模拟验证
		HttpSession session=request.getSession();
		if(name!=null && !name.equals("")) {
			session.setAttribute("user", name);
			response.sendRedirect("main.jsp");
		}
		else {
			session.setAttribute("msg", "输入的用户名或者密码不正确");
			response.sendRedirect("index.jsp");
		}
	}

}
