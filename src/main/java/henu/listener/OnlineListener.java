package henu.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineListener
 *
 */
@WebListener
public class OnlineListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public OnlineListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("session created");
    	ServletContext application=se.getSession().getServletContext();
    	if(application.getAttribute("num")==null) {
    		application.setAttribute("num", 1);
    	}
    	else {
    		int temp=(Integer)application.getAttribute("num");
    		application.setAttribute("num", temp+1);
    	}
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("session des");
    	ServletContext application=se.getSession().getServletContext();
         // TODO Auto-generated method stub
    	if(application.getAttribute("num")!=null) {
    		int temp=(Integer)application.getAttribute("num");
    		application.setAttribute("num", temp- 1);
    	}
    }
	
}
