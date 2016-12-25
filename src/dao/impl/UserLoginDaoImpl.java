package dao.impl;

import dao.dao.UserInfoDao;
import dao.dao.UserLoginDao;
import db.CreateSession;
import entity.UserInfo;
import entity.UserLogin;
import org.hibernate.Session;
import org.hibernate.query.Query;
import tools.Time;

import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */
public class UserLoginDaoImpl implements UserLoginDao {
    private static final String registerSuccess = "registerSuccess"; //注册成功和失败
    private static final String registerFail = "Email is already used";
    private static final String loginFail = "loginFail";   //登陆失败 密码或账号错误

    @Override
    public boolean userRegister(UserLogin userLogin) {
        final Session session = CreateSession.getSession();
        try {
            userLogin.setId(getNewUserId());
            System.out.println(userLogin.getId());
            session.beginTransaction();
            session.save(userLogin);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public UserInfo checkLogin(UserLogin userLogin) {
        final Session session = CreateSession.getSession();
        session.beginTransaction();
        try {
            String hql = "from entity.UserLogin where email=? and  password=?";
            Query query = session.createQuery(hql);
            query.setParameter(0, userLogin.getEmail());
            query.setParameter(1, userLogin.getPassword());
            List<UserLogin> list = query.list();
            session.getTransaction().commit();
            session.close();
            if (list.size() > 0){
                System.out.println(list.get(0).getId());
                UserInfoDaoImpl userInfoDao=new UserInfoDaoImpl();
                return userInfoDao.getUserInfo(list.get(0).getId());
            }
            else
                return null;
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    //生成新的用户ID
    private String getNewUserId() {
        String today = Time.getCurrentTime();
        final Session session = CreateSession.getSession();
        String hql = "select max(id) from entity.UserLogin";
        try {
            session.beginTransaction();
            Query query = session.createQuery(hql);
            String id = (String) query.uniqueResult();
            session.getTransaction().commit();
            session.close();
            System.out.println("当前id为" + id);
            if (id == null) {
                id = today + "000001";
                return id;
            } else {
                if (today.substring(2, 4).equals(id.substring(2, 4))) {
                    String num = id.substring(4);
                    int i = Integer.parseInt(num);
                    i++;
                    String nid = String.valueOf(i);
                    i = 6 - nid.length();
                    for (int j = 0; j < i; j++) {
                        nid = "0" + nid;
                    }
                    nid = today + nid;
                    return nid;
                } else {
                    return today + "000001";
                }
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }
}
