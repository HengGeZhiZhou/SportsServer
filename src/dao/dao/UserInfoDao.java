package dao.dao;

import entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */
public interface UserInfoDao {
    public abstract String setUserInfo(UserInfo userInfo);   //���ø�����Ϣ

    public abstract UserInfo getUserInfo(String uid);  //��ȡ�û�������Ϣ

}
