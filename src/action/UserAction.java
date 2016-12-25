package action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import dao.impl.UserLoginDaoImpl;
import entity.ReturnInfo;
import entity.UserInfo;
import entity.UserLogin;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/23.
 */
//http://localhost:8080/login_Register.action
public class UserAction extends SuperAction {
    private static final String registerSuccess = "registerSuccess"; //×¢²á³É¹¦ºÍÊ§°Ü
    private static final String registerFail = "Email is already used";
    private static final String loginFail = "loginFail";   //µÇÂ½Ê§°Ü ÃÜÂë»òÕËºÅ´íÎó
    private static final String loginSuccess = "loginSuccess";
    private ReturnInfo returnInfo = new ReturnInfo();

    public String Register() throws IOException {
        Gson gson = new Gson();
        UserLogin userLogin = gson.fromJson(getJson().toString(), UserLogin.class);
        UserLoginDaoImpl userLoginDao = new UserLoginDaoImpl();
        if (userLoginDao.userRegister(userLogin)) {
            setReturnInfo(1,registerSuccess);
            returnInfo.setData(userLogin);
            this.response.getWriter().write(gson.toJson(returnInfo));
            return "success";
        } else {
            setReturnInfo(2,registerFail);
            returnInfo.setData(userLogin);
            this.response.getWriter().write(gson.toJson(returnInfo));
            return "fail";
        }
    }

    public String loginCheck() throws IOException {
        Gson gson=new Gson();
        UserLogin userLogin = gson.fromJson(getJson().toString(), UserLogin.class);
        UserLoginDaoImpl userLoginDao = new UserLoginDaoImpl();
        UserInfo userInfo=userLoginDao.checkLogin(userLogin);
        if(userInfo!=null){
            setReturnInfo(1,loginSuccess);
            returnInfo.setData(userInfo);
            this.response.getWriter().write(gson.toJson(returnInfo));
            return "success";
        }else {
            setReturnInfo(2,loginFail);
            returnInfo.setData(null);
            this.response.getWriter().write(gson.toJson(returnInfo));
            return "fail";
        }
    }

    private StringBuffer getJson() {
        this.response.setContentType("text/html;charset=utf-8");
        this.response.setCharacterEncoding("UTF-8");
        StringBuffer json = new StringBuffer();
        String line = "";
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            return json;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void setReturnInfo(int resultCode,String resultMessage){
        returnInfo.setResultCode(resultCode);
        returnInfo.setResultMessage(resultMessage);
    }

    public ReturnInfo getReturnInfo() {
        return returnInfo;
    }
}
