package entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/12/23.
 */
@Entity
@Table(name = "user_info", schema = "project_db", catalog = "")
public class UserInfo {
    private String id;
    private String name;
    private String portrait;
    private String sex;
    private String age;
    private String height;
    private String weight;
    private String profiles;
    private String phone;
    private String email;

    @Id
    @Column(name = "_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "_portrait")
    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @Basic
    @Column(name = "_sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "_age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "_height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "_weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "_profiles")
    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    @Basic
    @Column(name = "_phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (id != null ? !id.equals(userInfo.id) : userInfo.id != null) return false;
        if (name != null ? !name.equals(userInfo.name) : userInfo.name != null) return false;
        if (portrait != null ? !portrait.equals(userInfo.portrait) : userInfo.portrait != null) return false;
        if (sex != null ? !sex.equals(userInfo.sex) : userInfo.sex != null) return false;
        if (age != null ? !age.equals(userInfo.age) : userInfo.age != null) return false;
        if (height != null ? !height.equals(userInfo.height) : userInfo.height != null) return false;
        if (weight != null ? !weight.equals(userInfo.weight) : userInfo.weight != null) return false;
        if (profiles != null ? !profiles.equals(userInfo.profiles) : userInfo.profiles != null) return false;
        if (phone != null ? !phone.equals(userInfo.phone) : userInfo.phone != null) return false;
        if (email != null ? !email.equals(userInfo.email) : userInfo.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (portrait != null ? portrait.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (profiles != null ? profiles.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", portrait='" + portrait + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", profiles='" + profiles + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
