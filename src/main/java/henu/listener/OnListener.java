package henu.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnListener implements HttpSessionListener{
private int num=0;
	public OnListener() {
	num=0;
}
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		se.getSession().setAttribute("num1", num+1);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		se.getSession().setAttribute("num1", num-1);
	}
}
