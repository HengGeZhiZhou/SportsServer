package test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dao.impl.UserInfoDaoImpl;
import dao.impl.UserLoginDaoImpl;
import entity.ReturnInfo;
import entity.UserInfo;
import entity.UserLogin;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */
public class Test {
    public static void main(String[] args) {

//        UserLogin userLogin=new UserLogin();
//        userLogin.setEmail("124456@qq.com");
//        userLogin.setPassword("123");
//        UserLoginDaoImpl userDao=new UserLoginDaoImpl();
//        System.out.println(userDao.userRegister(userLogin));
        UserLogin userLogin=new UserLogin();
        userLogin=null;
//        userLogin.setId("1");
//        userLogin.setEmail("124456@qq.com");
//        userLogin.setPassword("123");
//        UserLoginDaoImpl userLoginDao=new UserLoginDaoImpl();
//        System.out.println(userLoginDao.checkLogin(userLogin).toString());
//        UserInfoDaoImpl userInfoDao=new UserInfoDaoImpl();
//        UserInfo userInfo=userInfoDao.getUserInfo("1612000002");
//        System.out.println(userInfo.toString());
//        ReturnInfo returnInfo=new ReturnInfo();
//        returnInfo.setResultCode(1);
//        returnInfo.setResultMessage("warn");
//        returnInfo.setData(userLogin);
////        System.out.println(returnInfo.toString());
//        Gson gson=new Gson();
//        String gson1=gson.toJson(returnInfo);
//        System.out.println(gson1);
//
//        Type type=new TypeToken<ReturnInfo<UserLogin>>(){}.getType();
//        ReturnInfo returnInfo1= gson.fromJson(gson1,type);
//        UserLogin userLogin1= (UserLogin) returnInfo1.getData();
//         System.out.println(userLogin1.toString());



    }
}
