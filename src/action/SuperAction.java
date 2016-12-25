package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by star on 2016/12/20.
 */
public class SuperAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected ServletContext application;
    protected HttpSession session;

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
        this.session = request.getSession();
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void setServletContext(ServletContext application) {
        this.application = application;
    }
}
