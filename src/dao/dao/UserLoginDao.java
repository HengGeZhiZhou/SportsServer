package dao.dao;

import entity.UserInfo;
import entity.UserLogin;

/**
 * Created by Administrator on 2016/12/23.
 */
public interface UserLoginDao {

    public abstract boolean userRegister(UserLogin userLogin);  //用户注册  返回注册结果

    public abstract UserInfo checkLogin(UserLogin userLogin);  //检查用户登录 返回登录状态
}
