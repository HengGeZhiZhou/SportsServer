package dao.dao;

import entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */
public interface UserInfoDao {
    public abstract String setUserInfo(UserInfo userInfo);   //设置个人信息

    public abstract UserInfo getUserInfo(String uid);  //获取用户个人信息

}
