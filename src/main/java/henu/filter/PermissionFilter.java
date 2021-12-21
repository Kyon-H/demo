package henu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PermissionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
		HttpSession session = request2.getSession();
		String path = request2.getServletPath();
		if (path.indexOf("/index.jsp") >= 0 || path.indexOf("/check") >= 0) {
			chain.doFilter(request, response);
		} else {
			if (session.getAttribute("user") != null) {
				chain.doFilter(request, response);
			} else {
				session.setAttribute("msg", "您没有登录，无权访问，请先登录");
				response2.sendRedirect("index.jsp");
			}
		}
	}

}
