package dao.dao;

import entity.UserInfo;
import entity.UserLogin;

/**
 * Created by Administrator on 2016/12/23.
 */
public interface UserLoginDao {

    public abstract boolean userRegister(UserLogin userLogin);  //�û�ע��  ����ע����

    public abstract UserInfo checkLogin(UserLogin userLogin);  //����û���¼ ���ص�¼״̬
}
