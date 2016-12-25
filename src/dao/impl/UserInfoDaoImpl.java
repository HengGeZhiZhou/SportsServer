package dao.impl;

import dao.dao.UserInfoDao;
import db.CreateSession;
import entity.UserInfo;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */
public class UserInfoDaoImpl implements UserInfoDao {
    private static final String setUserInfoSuccess="uploadSuccess";  //上传信息失败
    private static final String setUserInfoFail="username is already used";

    @Override
    public String setUserInfo(UserInfo userInfo) {
        final Session session= CreateSession.getSession();
        try{
            session.beginTransaction();
            session.save(userInfo);
            session.getTransaction().commit();
            return setUserInfoSuccess;
        }  catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
            return setUserInfoFail;
        }
    }

    @Override
    public UserInfo getUserInfo(String uid) {
        final Session session=CreateSession.getSession();
        try{
            session.beginTransaction();
            UserInfo userInfo=session.get(UserInfo.class,uid);
            session.getTransaction().commit();
            session.close();
            return userInfo;
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }
}
